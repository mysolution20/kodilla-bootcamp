package com.kodilla.stream.forumuser;

import java.time.LocalTime;
import java.util.Objects;

public final class ForumUser {

//    private final int userId ;

    private final int userId ;
    private final String userName;
    private final  char gender;
    private final  LocalTime birthDay;  // this.localTime = LocalTime.of( year,month, day);
    private final int numberOfPosts ;

    public ForumUser(int userId, String userName, char gender ,int year, int month, int day, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthDay = LocalTime.of( year,month, day);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalTime getBirthDay() {
        return birthDay;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserId() == forumUser.getUserId() &&
                getGender() == forumUser.getGender() &&
                getNumberOfPosts() == forumUser.getNumberOfPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDay(), forumUser.getBirthDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserName(), getGender(), getBirthDay(), getNumberOfPosts());
    }
}
