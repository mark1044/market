package com.will.intent.data.mapping;

import org.joda.time.DateTime;

/**
 * Created by marksmelendez on 1/28/17.
 */

public class MarketMediaResource {

    private String URL;

    private DateTime timeStamp;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }


}
