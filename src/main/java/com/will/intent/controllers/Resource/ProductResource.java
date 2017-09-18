package com.will.intent.controllers.Resource;

import com.will.intent.data.mapping.MarketProduct;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marksmelendez on 2/15/17.
 */
@RestController
public class ProductResource {


    @RequestMapping(value = "/products" , method = RequestMethod.POST)
    public String addProduct(@RequestBody MarketProduct product){
        return product.getDescription();
    }
}
