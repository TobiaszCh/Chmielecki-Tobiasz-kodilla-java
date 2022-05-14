package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PhoneOrderRepository implements OrderRepository {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    @Override
    public boolean createOrder(User user, LocalDateTime from) {

        System.out.println(user.getName() + " " + user.getSecondName() + " bought product on " + orderRequest.getFrom());

        return true;
    }
}

