package com.kodilla.good.patterns.orders;

public class User {
    private final String name;
    private final String userName;

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
}
