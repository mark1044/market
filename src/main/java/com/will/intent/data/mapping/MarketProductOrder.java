package com.will.intent.data.mapping;

/**
 * Created by marksmelendez on 1/28/17.
 */
public class MarketProductOrder {

    private MarketProduct product;

    private int quantity;

    public MarketProduct getProduct() {
        return product;
    }

    public void setProduct(MarketProduct product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
