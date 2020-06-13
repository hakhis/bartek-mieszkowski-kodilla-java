package com.kodilla.good.patterns.challenges.food2door.producers;

public interface Producer {
    String getProducerName();
    boolean process(String name, int amount);
}
