package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public class FoodOrderRepository implements OrderRepository {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    @Override
    public void createOrder(Customer customer, LocalDateTime order) {
        System.out.println(customer.getName() + " " + customer.getSecondName() + " bought product on " + orderRequest.getTo());
    }
}

