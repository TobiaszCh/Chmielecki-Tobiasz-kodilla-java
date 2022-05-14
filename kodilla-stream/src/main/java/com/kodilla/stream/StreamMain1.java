package com.kodilla.stream;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import java.util.*;
import java.util.stream.Collectors;


public class StreamMain1 {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theUsersForum = forum.theGetForum().stream().filter(forumUser ->
                forumUser.getSex() == 'M').filter(forumUser -> forumUser.getDateOfBrith().getYear() <= 2002).filter(forumUser -> forumUser.getPostCount() > 0).
                collect(Collectors.toMap(ForumUser::getUniqueID, forumUser -> forumUser));

        System.out.println("Elements: " + theUsersForum.size());
        theUsersForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
