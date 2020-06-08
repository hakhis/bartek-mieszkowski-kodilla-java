package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ProducerBase;

public class Application {
    public static void main(String[] args) {
        ShopInitializer shopInitializer = new ShopInitializer(new ProducerBase(), new UserBase());
        shopInitializer.initialize();
    }
}
