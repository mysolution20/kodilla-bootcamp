package com.kodilla.testing.forum.statistics;

public class StatisticsPicker {
    private double numOfUsers;
    private double numOfPosts;
    private double numOfComments;
    private double avgNumOfPostPerUser;
    private double avgNumOfCommentsPerUser;
    private double avgNumOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numOfUsers = statistics.usersNames().size();
        if (numOfUsers != 0) {
            numOfPosts = statistics.postsCount();
            numOfComments = statistics.commentsCount();
        } else {
            numOfPosts = 0;
            numOfComments = 0;
        }
        avgNumOfPostPerUser = (numOfUsers != 0) ? numOfPosts / numOfUsers : 0;
        avgNumOfCommentsPerUser = (numOfUsers != 0) ? numOfComments / numOfUsers : 0;
        avgNumOfCommentsPerPost = (numOfPosts != 0) ? numOfComments / numOfPosts : 0;
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

    public double getNumOfUsers() {
        return numOfUsers;
    }

    public double getNumOfPosts() {
        return numOfPosts;
    }

    public double getNumOfComments() {
        return numOfComments;
    }

    public double getAvgNumOfPostPerUser() {
        return avgNumOfPostPerUser;
    }

    public double getAvgNumOfCommentsPerUser() {
        return avgNumOfCommentsPerUser;
    }

    public double getAvgNumOfCommentsPerPost() {
        return avgNumOfCommentsPerPost;
    }
}
