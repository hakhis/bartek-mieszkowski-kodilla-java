package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class UserBase {
    private List<User> userBase;

    public UserBase() {
        userBase = new ArrayList<>();
    }

    public boolean addUser(User user) {
        if (userBase.contains(user)) {
            System.out.println("User already registered!");
            return false;
        } else {
            userBase.add(user);
            System.out.println("New user successfully registered!");
            return true;
        }
    }

    public List<User> getUserBase() {
        return userBase;
    }
}
