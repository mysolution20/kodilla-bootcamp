package com.kodilla.testing.statistics;

import java.util.List;

public class StatisticsPicker implements Statistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averageNumberOfPostsPerUser;
    private int averageNumberOfCommentsPerUser;
    private int averageNumberOfCommentsPerPost;

    public int calculateAdvStatistics(Statistics statistics){
        return 1;
    }

    public List<String> usersNames() {
        return null;
    }

    public int postsCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }
}
