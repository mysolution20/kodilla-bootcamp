package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StatisticsPicker implements Statistics{

    private String userName;
    private int numOfPosts;
    private int numOfComments;

    public StatisticsPicker(String userName, int numOfPosts, int numOfComments) {
        this.userName = userName;
        this.numOfPosts = numOfPosts;
        this.numOfComments = numOfComments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatisticsPicker)) return false;

        StatisticsPicker that = (StatisticsPicker) o;

        if (numOfPosts != that.numOfPosts) return false;
        if (numOfComments != that.numOfComments) return false;
        if (!userName.equals(that.userName)) return false;
        return usersNames.equals(that.usersNames);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + numOfPosts;
        result = 31 * result + numOfComments;
        result = 31 * result + usersNames.hashCode();
        return result;
    }




//    private int numOfUsers;
//    private int numOfPosts;
//    private int numOfComments;
//    private int avgNumOfPostsPerUser;
//    private int avgNumOfCommentsPerUser;
//    private int avgNumOfCommentsPerPost;

    Set<Statistics> statisticList = new HashSet<>();
    statisticList.add()


    List <String> usersNames = new ArrayList<>();
    public List<String> usersNames() {
        for (String userName: usersNames             ) {
            usersNames.add("mrsmith");
            usersNames.add("mrkowalski");
            usersNames.add("mrnowak");
            usersNames.add("mrkowal");
            usersNames.add("mrmuller");
        }
        return usersNames;
    }




    public double calculateAdvStatistics(Statistics statistics){
        return 1;
    }

    public int postsCount() {
        return 3; //posts.size();
    }

    public int commentsCount() {
        return 6;
    }






}
