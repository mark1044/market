package com.will.intent.data.mapping;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by marksmelendez on 2/5/17.
 */
@Document
public class MarketProductTag {
    /**
     * want to remove obljectId
     */
    @Id
    private ObjectId id;

    private String tag;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
