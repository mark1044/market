package com.will.intent.data.repo;

import com.will.intent.data.ops.MarketUserOperations;
import com.will.intent.data.mapping.MarketUser;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by marksmelendez on 1/15/17.
 */

public interface MarketUserRepository extends MongoRepository<MarketUser, ObjectId>, MarketUserOperations {
    //CONVENTIONS

}