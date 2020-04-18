package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userId ;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts ;

    public ForumUser(int userId, String userName, char gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
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
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserName(), getGender(), getBirthDate(), getNumberOfPosts());
    }
}
