package com.kodilla.patterns.prototype.strategy.social;

public class Millenials extends User{
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
