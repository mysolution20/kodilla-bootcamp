package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;

    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();
    public ForumUser(){}
    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

//-------------------------------------------------------------------

    // 1b
    public void addPost(String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    // 2b
    public void addComment(ForumPost thePost, String author, String commentBody){
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    // 1a
    public int getPostsQuantity(){

        return posts.size();
    }

    // 2a
    public int getCommentsQuantity(){
        return comments.size();
    }

    // 3a
    public ForumPost getPost(int postNumber){

        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    // 3b
    public ForumComment getComment(int commentNumber){

        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    // 4a
    public boolean removePost(ForumPost thePost){

        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    // 4b
    public boolean removeComment(ForumComment theComment){

        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

//-------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
