package com.kodilla.stream.forumUser;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public  Forum() {

        theUserList.add(new ForumUser(1, "Tobi", 'M', 2008, 2, 6, 33));
        theUserList.add(new ForumUser(2, "Ken", 'F', 2009, 1, 7, 333));
        theUserList.add(new ForumUser(3, "Job", 'F', 1994, 12, 8, 334));
        theUserList.add(new ForumUser(4, "Andre", 'F', 2000, 6, 12, 63));
        theUserList.add(new ForumUser(5, "Rom", 'M', 1999, 12, 22, 104));
    }

    public List<ForumUser> theGetForum() {
        return new ArrayList<>(theUserList);
    }
}
