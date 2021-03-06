package com.kodilla.patterns.prototype.strategy.social;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
