package com.kodilla.good.patterns.challenges.food2door.producers;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer {
    private String producerName = "GlutenFreeShop";
    private Map<String, Integer> productList;

    public GlutenFreeShop() {
        productList = new HashMap<>();
        productList.put("Glutenfree Water", 100);
        productList.put("Bag of tasty rocks", 100);
    }

    @Override
    public boolean process(String name, int amount) {
        System.out.println("Super sale today! Buy 1 get 2!");
        if (productList.containsKey(name)) {
            if (productList.get(name) > amount * 2) {
                System.out.println("Congrats! You will get " + amount * 2 + " of " + name);
                productList.replace(name, productList.get(name) - amount * 2);
                return true;
            } else {
                System.out.println("Sorry, we only have " + productList.get(name) + " of " + name);
                return false;
            }
        } else {
            System.out.println("Sorry, we do not have this product!");
            return false;
        }
    }

    @Override
    public String getProducerName() {
        return producerName;
    }
}
