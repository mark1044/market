package com.will.intent.data.DTO;

import com.will.intent.data.mapping.MarketProduct;

import java.util.List;
/**
 * Created by marksmelendez on 1/31/17.
 */
public class MarketProductListDTO {



    private List<MarketProduct> products;

    public List<MarketProduct> getProducts() {
        return products;
    }

    public void setProducts(List<MarketProduct> produacts) {
        this.products = produacts;
    }

}
