package com.kodilla.patterns.prototype.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Snapchat";
    }
}
