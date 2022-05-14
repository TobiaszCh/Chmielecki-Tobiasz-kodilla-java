package com.kodilla.good.patterns.challenges;

public class OrderDTo {

    private final User user;
    private final boolean isOrdered;

    public OrderDTo(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public User getUser() {
        return user;
    }
}
