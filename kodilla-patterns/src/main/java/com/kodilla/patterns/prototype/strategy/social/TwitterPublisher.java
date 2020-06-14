package com.kodilla.patterns.prototype.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Twitter";
    }
}
