package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by marksmelendez on 1/26/17.
 */

@Document
public class MarketCart {

    @Id
    private ObjectId id;

    private Collection<MarketProductOrder> products = new LinkedHashSet<MarketProductOrder>();

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Collection<MarketProductOrder> getProducts() {
        return products;
    }

    public void setProducts(Collection<MarketProductOrder> products) {
        this.products = products;
    }

}
