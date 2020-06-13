package com.kodilla.good.patterns.challenges.food2door.producers;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {
    private Map<String, Integer> productList;
    private String producerName = "ExtraFoodShop";

    public ExtraFoodShop() {
        productList = new HashMap<>();
        productList.put("Japanese Golden Apples", 100);
        productList.put("Siberian Oranges", 100);
    }
    @Override
    public boolean process(String name, int amount) {
        if (productList.containsKey(name)) {
            if (productList.get(name) >= amount) {
                int newAmount = productList.get(name) - amount;
                productList.replace(name, newAmount);
                System.out.println("You have bought " + amount + " " + name);
                System.out.println("Only " + newAmount + " of it left!");
                return true;
            } else {
                System.out.println("Sorry! We have only " + productList.get(name) + " in stock!");
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
