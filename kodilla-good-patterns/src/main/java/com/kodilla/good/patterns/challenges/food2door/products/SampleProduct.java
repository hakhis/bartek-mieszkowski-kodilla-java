package com.kodilla.good.patterns.challenges.food2door.products;

public class SampleProduct implements Product {
    private String name;
    int amount;

    public SampleProduct(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name +
                " in amount of " + amount;
    }
}
