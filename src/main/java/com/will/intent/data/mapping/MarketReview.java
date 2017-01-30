package com.will.intent.data.mapping;

import org.joda.time.DateTime;

/**
 * Created by marksmelendez on 1/26/17.
 */
public class MarketReview {

    private String creatorUsername;

    private String review;

    private DateTime timeStamp;

    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public DateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
