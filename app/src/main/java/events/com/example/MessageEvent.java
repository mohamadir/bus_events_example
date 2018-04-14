package events.com.example;

/**
 * Created by מוחמד on 14/04/2018.
 */

public  class MessageEvent {
    private String event="";

    public MessageEvent(String event){
        this.event = event;
    }
    public String getEvent() {
        return event;
    }
}
