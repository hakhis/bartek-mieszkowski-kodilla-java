package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.producers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.producers.ProducerBase;

public class ShopInitializer {
    private ProducerBase producerBase;
    private UserBase userBase;

    public ShopInitializer(ProducerBase producerBase, UserBase userBase) {
        this.producerBase = producerBase;
        this.userBase = userBase;
    }

    public void initialize() {
        producerBase.addProducer(new ExtraFoodShop());
        producerBase.addProducer(new GlutenFreeShop());
        producerBase.addProducer(new HealthyShop());

        userBase.addUser(new User("Mick", "Jagger", "scarface101"));
        userBase.addUser(new User("Maryla", "Rodowicz", "MeltedDino"));
        userBase.addUser(new User("Donald", "Trump", "ilnukeu"));
    }

    public ProducerBase getProducerBase() {
        return producerBase;
    }

    public UserBase getUserBase() {
        return userBase;
    }
}
