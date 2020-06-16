package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String lastName;
    private String userName;
    private List<Product> shoppingBasket;

    public User(String name, String lastName, String userName) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        shoppingBasket = new ArrayList<>();
    }

    public boolean addToBasket(Product product) {
        shoppingBasket.add(product);
        return true;
    }

    public void showBasket() {
        System.out.println("Content of " + userName + " basket:");
        for (Product p : shoppingBasket) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (" + userName + ")";
    }
}
