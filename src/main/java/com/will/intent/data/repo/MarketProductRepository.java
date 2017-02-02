package com.will.intent.data.repo;

import com.will.intent.data.mapping.MarketProduct;
import com.will.intent.data.ops.MarketProductOperations;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by marksmelendez on 1/31/17.
 */
public interface MarketProductRepository extends MongoRepository<MarketProduct, ObjectId>, MarketProductOperations {

}
