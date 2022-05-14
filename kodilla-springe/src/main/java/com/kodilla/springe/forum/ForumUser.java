package com.kodilla.springe.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private final String username;

    public ForumUser() {
        this.username = "John Smith";

    }

    public String getUser() {
        return username;
    }
}
