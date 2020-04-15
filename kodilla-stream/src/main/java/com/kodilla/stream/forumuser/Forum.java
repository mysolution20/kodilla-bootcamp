package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {

        theForumUserList.add(new ForumUser(1, "mrgalanomin",'M',2000,01,14,10));
        theForumUserList.add(new ForumUser(1, "mrspaluchada",'F',2000,02,24,20));
        theForumUserList.add(new ForumUser(1, "mrkowaladam",'M',2001,04,01,23));
        theForumUserList.add(new ForumUser(1, "mrspoleclidia",'F',2002,12,02,14));

          }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }

    
}
