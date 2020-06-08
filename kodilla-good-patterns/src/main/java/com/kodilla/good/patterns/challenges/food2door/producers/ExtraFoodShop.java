package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {
    private Map<Product, Integer> productList;

    public ExtraFoodShop() {
        productList = new HashMap<>();
    }
    @Override
    public void process() {

    }
}
