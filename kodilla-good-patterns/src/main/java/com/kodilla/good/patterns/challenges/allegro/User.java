package com.kodilla.good.patterns.challenges.allegro;

public class User {
    private String name;
    private String lastName;
    private String userName;

    public User(String name, String lastName, String userName) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (" + userName + ")";
    }
}
