package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producers.ProducerBase;

public class ShopInitializer {
    private ProducerBase producerBase;

    public ShopInitializer(ProducerBase producerBase) {
        this.producerBase = producerBase;
    }

    public void initialize() {
        producerBase.addProducer(new ExtraFoodShop());
        producerBase.addProducer(new GlutenFreeShop());
        producerBase.addProducer(new HealthyShop());
    }

    public ProducerBase getProducerBase() {
        return producerBase;
    }
}
