package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.*;

public class StatisticsPicker {

    private String userName;

    //    private int numOfPosts;
//    private int numOfComments;

    public StatisticsPicker(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticsPicker that = (StatisticsPicker) o;
        return userName.equals(that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    public String getUserName() {
        return userName;
    }
}
