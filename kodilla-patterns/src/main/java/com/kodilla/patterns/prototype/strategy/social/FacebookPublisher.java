package com.kodilla.patterns.prototype.strategy.social;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Facebook";
    }
}
