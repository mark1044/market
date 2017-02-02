package com.will.intent.data.ops;

import com.will.intent.data.mapping.MarketProduct;
import java.util.List;
/**
 * Created by marksmelendez on 1/31/17.
 */
public interface MarketProductOperations {

    List<MarketProduct> getProducts();
    MarketProduct getProduct(String productName);

}
