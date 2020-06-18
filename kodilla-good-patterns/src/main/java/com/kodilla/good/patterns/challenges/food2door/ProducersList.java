package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;

import java.util.HashMap;
import java.util.Map;

public class ProducersList {
    private Map<String, Producer> producerMap;

    public ProducersList() {
        producerMap = new HashMap<>();
    }

    public boolean addProducer(Producer producer) {
        if (producerMap.containsKey(producer.getProducerName())) {
            System.out.println("Producer already exists in database");
            return false;
        } else {
            producerMap.put(producer.getProducerName(), producer);
            return true;
        }
    }

    public Map<String, Producer> getProducerMap() {
        return producerMap;
    }

}
