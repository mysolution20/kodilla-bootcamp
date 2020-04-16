package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "mrgalanomin", 'M', 1410, 10, 14, 3));
        theForumUserList.add(new ForumUser(2, "mrspaluchada", 'F', 1979, 11, 2, 4));
        theForumUserList.add(new ForumUser(3, "mrkowaladam", 'M', 1982, 4, 23, 8));
        theForumUserList.add(new ForumUser(4, "mrspoleclidia", 'F', 1998, 12, 2, 9));
        theForumUserList.add(new ForumUser(5, "mrsmariakowalsk", 'F', 1995, 10, 3, 23));
        theForumUserList.add(new ForumUser(6, "mrnowakgrzegorz", 'M', 1993, 8, 2, 0));
    }

    public List<ForumUser> getUserList() {
        return theForumUserList;
    }
}
