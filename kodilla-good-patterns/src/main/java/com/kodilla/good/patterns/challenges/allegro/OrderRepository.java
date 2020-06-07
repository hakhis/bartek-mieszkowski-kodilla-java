package com.kodilla.good.patterns.challenges.allegro;

public interface OrderRepository {
    void addOrder (User user, Product product);
    void displayOrders();
}
