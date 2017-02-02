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
public class MarketProduct {

    @Id
    private ObjectId id;

    private String sellerUserName;

    private String description;

    private String productName;

    private DateTime dateAdded;

    private String price;

    private boolean purchased;

    private Collection<MarketMediaResource> mediaResources = new LinkedHashSet<MarketMediaResource>();

    private Collection<MarketIM> imPool = new LinkedHashSet<MarketIM>();

    private Collection<MarketReview> reviewPool = new LinkedHashSet<MarketReview>();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSellerUserName() {
        return sellerUserName;
    }

    public void setSellerUserName(String sellerUserName) {
        this.sellerUserName = sellerUserName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public DateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public Collection<MarketMediaResource> getMediaResources() {
        return mediaResources;
    }

    public void setMediaResources(Collection<MarketMediaResource> mediaResources) {
        this.mediaResources = mediaResources;
    }

    public Collection<MarketIM> getImPool() {
        return imPool;
    }

    public void setImPool(Collection<MarketIM> imPool) {
        this.imPool = imPool;
    }

    public Collection<MarketReview> getReviewPool() {
        return reviewPool;
    }

    public void setReviewPool(Collection<MarketReview> reviewPool) {
        this.reviewPool = reviewPool;
    }


}
