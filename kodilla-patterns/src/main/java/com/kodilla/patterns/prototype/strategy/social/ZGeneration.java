package com.kodilla.patterns.prototype.strategy.social;

public class ZGeneration extends User{
    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
