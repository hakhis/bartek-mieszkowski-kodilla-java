package com.kodilla.good.patterns.challenges.food2door.products;

public class HealthyProductA implements Product {
    private String name;


    @Override
    public boolean isAvailable() {
        return false;
    }
}
