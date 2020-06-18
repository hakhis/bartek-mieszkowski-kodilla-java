package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.producers.Producer;
import com.kodilla.good.patterns.challenges.food2door.products.Product;

public class Order {
    private User user;
    private Product product;
    private String producer;

    public Order(User user, Product product, String producer) {
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

    public String getProducer() {
        return producer;
    }
}
