package com.kodilla.good.patterns.challenges.food2door.producers;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerBase {
    private List<Producer> producerList;

    public ProducerBase() {
        producerList = new ArrayList<>();
    }

    public boolean addProducer(Producer producer) {
        if (producerList.contains(producer)) {
            System.out.println("Producer already registered!");
            return false;
        } else {
            producerList.add(producer);
            System.out.println("New producer successfully registered!");
            return true;
        }
    }

    public List<Producer> getProducerList() {
        return producerList;
    }
}
