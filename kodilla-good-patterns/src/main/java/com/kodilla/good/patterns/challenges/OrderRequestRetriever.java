package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Tomasz", "Działa");

        LocalDateTime orderFrom = LocalDateTime.of(2020, 8, 1, 12, 0);
        LocalDateTime deliverTo = LocalDateTime.of(2020, 8, 5, 11, 12);

        Product product = new Product("Samsung Galaxy s8", 1200);

        return new OrderRequest(user, orderFrom, deliverTo, product);
    }

}
