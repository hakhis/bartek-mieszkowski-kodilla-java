package com.kodilla.good.patterns.challenges.food2door.producers;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {
    private String producerName = "HealthyShop";
    private Map<String, Integer> productList;

    public HealthyShop() {
        productList = new HashMap<>();
        productList.put("Baby spinach", 0);
        productList.put("Rucola leafs", 0);
    }
    @Override
    public boolean process(String name, int amount) {
        if (productList.containsKey(name)) {
            System.out.println("Dear customer, we grow microgreens on demand, " +
                    "so delivery time is dependant of the amount You order!");
            String message = "You ordered " + amount + " grams of " + name + ". Your order will be delivered in ";
            if (amount < 100) {
                System.out.println(message + 1 + " day");
            } else if (amount >= 100 && amount < 500) {
                System.out.println(message + 2 + " days");
            } else {
                System.out.println(message + 3 + " days");
            }
            return true;
        } else {
            System.out.println("Sorry! We do not have " + name + " in our offer!");
            return false;
        }
    }

    @Override
    public String getProducerName() {
        return producerName;
    }
}
