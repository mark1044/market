package com.will.intent.API.REST.Products;

import com.will.intent.data.mapping.MarketProduct;
import com.will.intent.data.repo.MarketProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marksmelendez on 1/25/17.
 */
@RestController
@RequestMapping("/products")
public class ProductResource {

    /*
     * request parameters can also be referenced in a RestController --) @RequestParam("categoryId") long categoryId
     */

    @Autowired
    private MarketProductRepository productRepo;


    @RequestMapping(value="/{productName}", method = RequestMethod.GET)
    public MarketProduct getProduct(@PathVariable("productName") String productName){

        System.out.println(productName);

        MarketProduct product = productRepo.getProduct(productName);

        System.out.println(product.getDescription());

        return product;
    }




}
