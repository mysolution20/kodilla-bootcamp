package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public final class ForumUser {

    private final int userId ;
    private final String userName;
    private final  char gender;
    private  int year;
    private  int month;
    private  int day;
    private final LocalDate birthDay ;  //   LocalDate  this.localTime = LocalDate.of( year,month, day);
    private final int numberOfPosts ;

    public ForumUser(int userId, String userName, char gender, int year, int month, int day, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthDay = LocalDate.of( year,month, day);
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

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public LocalDate getBirthDay() {
        return birthDay;
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
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", birthDay=" + birthDay +
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
                getYear() == forumUser.getYear() &&
                getMonth() == forumUser.getMonth() &&
                getDay() == forumUser.getDay() &&
                getNumberOfPosts() == forumUser.getNumberOfPosts() &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                Objects.equals(getBirthDay(), forumUser.getBirthDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserName(), getGender(), getYear(), getMonth(), getDay(), getBirthDay(), getNumberOfPosts());
    }
}
