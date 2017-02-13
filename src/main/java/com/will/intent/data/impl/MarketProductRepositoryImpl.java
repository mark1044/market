package com.will.intent.data.impl;

import com.will.intent.data.mapping.MarketProduct;
import com.will.intent.data.ops.MarketProductOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Collections;
import java.util.List;

/**
 * Created by marksmelendez on 1/31/17.
 */
public class MarketProductRepositoryImpl implements MarketProductOperations {

    @Autowired
    MongoOperations mongo;

    @Override
    public List<MarketProduct> getProductsByTag(String tag, int pg, int count) {

        List<MarketProduct> products = mongo.find(Query.query(Criteria.where("tags").in(tag)).skip(pg*count).limit(count), MarketProduct.class);
        if(products == null){

            products = Collections.emptyList();

        }

        return products;
    }

    @Override
    public MarketProduct getProduct(String productName) {
        MarketProduct product = mongo.findOne(Query.query(Criteria.where("productName").is(productName)), MarketProduct.class);
        if(product != null) {
            System.out.println(product.getDescription());
        }else{

            System.out.print("ti's null!");

        }
        return product;
    }
}
