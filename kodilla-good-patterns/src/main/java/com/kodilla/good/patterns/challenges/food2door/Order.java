package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class Order {
    private User user;
    private Product product;
    private Producer producer;

    public Order(User user, Product product, Producer producer) {
        this.user = user;
        this.product = product;
        this.producer = producer;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }
}
