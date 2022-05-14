package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User1 user = null;
        //System.out.println(user.getUserName());

        Optional<User1> optionalUser = Optional.ofNullable(user);
        String username =
                optionalUser.orElse(new User1("tt", 0, 0, "")).getUserName();

        System.out.println(username);
    }

}
