package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer("Tomasz", "Działa");
        LocalDateTime order = LocalDateTime.of(2020, 8, 1, 12, 0);
        Product product = new Product("Cukier trzcinowy", 40.0);
        return new OrderRequest(customer, order, product);
    }

}
