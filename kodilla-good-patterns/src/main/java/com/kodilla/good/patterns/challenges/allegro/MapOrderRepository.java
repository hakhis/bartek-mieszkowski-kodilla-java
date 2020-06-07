package com.kodilla.good.patterns.challenges.allegro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapOrderRepository implements OrderRepository {
    private Map<User, ArrayList<Product>> orders;

    public MapOrderRepository() {
        orders = new HashMap<>();
    }

    @Override
    public void addOrder (User user, Product product) {
        if (orders.containsKey(user)) {
            orders.get(user).add(product);
        } else {
            orders.put(user, new ArrayList<>());
            orders.get(user).add(product);
        }
    }

    @Override
    public void displayOrders() {
        for (Map.Entry<User, ArrayList<Product>> entry : orders.entrySet()) {
            System.out.println("User: " + entry.getKey());
            System.out.println("Ordered items: ");
            for (Product products : entry.getValue()) {
                System.out.println(products);
            }
        }
    }
}
