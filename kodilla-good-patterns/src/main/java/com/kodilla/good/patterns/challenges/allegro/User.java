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

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " (" + userName + ")";
    }
}
