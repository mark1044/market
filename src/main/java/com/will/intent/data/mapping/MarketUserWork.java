package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by marksmelendez on 1/26/17.
 */

@Document
public class MarketUserWork {

    @Id
    private ObjectId id;

    private String description;

    private Collection<MarketMediaResource> mediaResources = new LinkedHashSet<MarketMediaResource>();

    private DateTime dateAdded;

    private Collection<MarketReview> reviewPool = new LinkedHashSet<MarketReview>();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<MarketMediaResource> getMediaResources() {
        return mediaResources;
    }

    public void setMediaResources(Collection<MarketMediaResource> mediaResources) {
        this.mediaResources = mediaResources;
    }

    public DateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Collection<MarketReview> getReviewPool() {
        return reviewPool;
    }

    public void setReviewPool(Collection<MarketReview> reviewPool) {
        this.reviewPool = reviewPool;
    }

}
