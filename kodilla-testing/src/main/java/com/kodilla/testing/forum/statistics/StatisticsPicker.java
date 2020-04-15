package com.kodilla.testing.forum.statistics;

public class StatisticsPicker {

    private int numOfUsers;
    private int numOfPosts;
    private int numOfComments;


    private int avgNumOfPostPerUser;
    private int avgNumOfCommentsPerUser;
    private int avgNumOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        numOfPosts = statistics.postsCount();
        numOfUsers = statistics.usersNames().size();
        numOfComments = statistics.commentsCount();
        avgNumOfPostPerUser = numOfPosts / numOfUsers;
        avgNumOfCommentsPerUser = numOfComments / numOfUsers;
        avgNumOfCommentsPerPost = numOfComments / numOfPosts;

    }

    public void showStatistics() {

        System.out.println(
                "Number of posts =: " + numOfPosts + ",\n" +
                "Number of users =: " + numOfUsers + ",\n" +
                "Number of comments =: " + numOfComments + ",\n" +
                "Average posts per user =: " + avgNumOfPostPerUser + ",\n" +
                "Average post per user =: " + avgNumOfPostPerUser + ",\n" +
                "Average comment per post =: " + avgNumOfCommentsPerPost

        );
    }

    public int getNumOfUsers() {
        return numOfUsers;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public int getNumOfComments() {
        return numOfComments;
    }

    public int getAvgNumOfPostPerUser() {
        return avgNumOfPostPerUser;
    }

    public int getAvgNumOfCommentsPerUser() {
        return avgNumOfCommentsPerUser;
    }

    public int getAvgNumOfCommentsPerPost() {
        return avgNumOfCommentsPerPost;
    }
}
