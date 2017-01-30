package com.will.intent.data.ops;

import com.will.intent.data.mapping.MarketUser;

/**
 * Created by marksmelendez on 1/15/17.
 */
/*
 * Custom method definition to be implemented in the mixin implementation
 */
public interface MarketUserOperations {
    MarketUser findUserByName(String username);
}
