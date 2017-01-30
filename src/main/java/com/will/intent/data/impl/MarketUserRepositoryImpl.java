package com.will.intent.data.impl;

import com.will.intent.data.ops.MarketUserOperations;
import com.will.intent.data.mapping.MarketUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by marksmelendez on 1/16/17.
 */
public class MarketUserRepositoryImpl implements MarketUserOperations {

    @Autowired
    MongoOperations mongo;

    @Override
    public MarketUser findUserByName(String username) {

        MarketUser user = mongo.findOne(Query.query(Criteria.where("userName").is(username)), MarketUser.class);

        return user;

    }
}
