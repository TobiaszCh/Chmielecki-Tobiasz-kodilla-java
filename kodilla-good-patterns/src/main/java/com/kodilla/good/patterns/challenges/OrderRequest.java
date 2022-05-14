package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final LocalDateTime from;
    private final LocalDateTime to;
    private final Product product;

    public OrderRequest(User user, LocalDateTime from, LocalDateTime to, Product product) {
        this.user = user;
        this.from = from;
        this.to = to;
        this.product = product;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public User getUser() {
        return user;
    }
}
