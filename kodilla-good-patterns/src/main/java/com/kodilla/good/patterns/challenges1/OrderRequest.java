package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public class OrderRequest {

    private final Customer customer;
    private final LocalDateTime order;
    private final Product product;

    public OrderRequest(Customer customer, LocalDateTime order, Product product) {
        this.customer = customer;
        this.order = order;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTo() {
        return order;
    }

    public Customer getUser() {
        return customer;
    }


}
