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

    private DateTime dateAdded;

    private String price;

    private boolean purchased;

    private Collection<MarketMediaResource> mediaResources = new LinkedHashSet<MarketMediaResource>();

    private Collection<MarketIM> imPool = new LinkedHashSet<MarketIM>();

    private Collection<MarketReview> reviewPool = new LinkedHashSet<MarketReview>();


}
