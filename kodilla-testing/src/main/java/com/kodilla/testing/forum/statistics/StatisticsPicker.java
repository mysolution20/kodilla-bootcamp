package com.kodilla.testing.forum.statistics;
import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.*;

public class StatisticsPicker {

    private String userName;
    private String forumPost;
    private String forumComment;
    private int numOfPosts;
    private int numOfComments;
    Statistics statistics;

    public StatisticsPicker(String userName) {
        this.userName = userName;
    }

    public StatisticsPicker(String userName, String forumPost, String forumComment) {
        this.userName = userName;
        this.forumPost = forumPost;
        this.forumComment = forumComment;
    }

    public int calculateNumberOfUsers(String userName)    {
        Set<String>  userList = new HashSet<>();
        userList.add(userName);
        return  userList.size();
    }

    public void postsCount(String forumPost)    {
        List<String>  postsList = new ArrayList<>();
        postsList.add(forumPost);
        numOfPosts =   postsList.size();
    }

    public void commentsCount(String forumComment)    {
        List<String>  commentList = new ArrayList<>();
        commentList.add(forumComment);
        numOfComments =  commentList.size();
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public int getNumOfComments() {
        return numOfComments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticsPicker that = (StatisticsPicker) o;
        return Objects.equals(userName, that.userName) &&
                Objects.equals(forumPost, that.forumPost) &&
                Objects.equals(forumComment, that.forumComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, forumPost, forumComment);
    }
}
