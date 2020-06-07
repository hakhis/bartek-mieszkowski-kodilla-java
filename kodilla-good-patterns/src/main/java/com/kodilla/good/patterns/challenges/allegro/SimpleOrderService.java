package com.kodilla.good.patterns.challenges.allegro;

public class SimpleOrderService implements OrderService {
    public boolean makeOrder(User user, Product product) {
        if (product.isAvailable()) {
            return true;
        } else {
            return false;
        }
    }
}
