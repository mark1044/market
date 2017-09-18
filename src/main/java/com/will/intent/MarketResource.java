package com.will.intent;

import com.will.intent.API.REST.ApiResponse;
import com.will.intent.data.mapping.MarketProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marksmelendez on 2/16/17.
 */

@RestController
@RequestMapping("/bagua")
public class MarketResource {

    @Autowired
    MongoOperations mongo;

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    ApiResponse add(@RequestBody MarketProduct product) {

        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getProductName());
        System.out.println(product.getSellerUserName());

       /*
       *
       * This is a trial end point
       * being implemented
       *
       * */



        return new ApiResponse(ApiResponse.Status.OK, product);
    }
}
