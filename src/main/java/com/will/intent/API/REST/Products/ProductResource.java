package com.will.intent.API.REST.Products;

import com.will.intent.API.REST.ApiResponse;
import com.will.intent.data.mapping.MarketProduct;
import com.will.intent.data.repo.MarketProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ApiResponse addProduct(@RequestBody MarketProduct product){

        return null;
    }



    @RequestMapping(value="/{productName}", method = RequestMethod.GET)
    public MarketProduct getProduct(@PathVariable("productName") String productName){

        System.out.println(productName);

        MarketProduct product = productRepo.getProduct(productName);

        System.out.println(product.getDescription());

        return product;
    }


    @RequestMapping(value="/{tag}/{pg}/{count}", method = RequestMethod.GET)
    public List<MarketProduct> getProductsByTag(@PathVariable("tag") String productName, @PathVariable("pg") int pg, @PathVariable("count") int count){


        return null;
    }


}
