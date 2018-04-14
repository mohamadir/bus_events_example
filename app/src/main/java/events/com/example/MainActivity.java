package events.com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
    }








    public void throwEvent(View view) {
        startActivity(new Intent(this,Main2Activity.class));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000);
                    EventBus.getDefault().post(new MessageEvent("My Event"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }



}
