package com.will.intent.data.mapping;


import org.joda.time.DateTime;

/**
 * Created by marksmelendez on 1/26/17.
 */
public class MarketIM {

    private String message;

    private String userName;

    private DateTime timeStamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

}
