package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {

    private final String name;
    private final String secondName;

    public User(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(secondName, user.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}
