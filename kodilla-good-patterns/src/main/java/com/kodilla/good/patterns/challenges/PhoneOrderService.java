package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PhoneOrderService implements OrderService {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    @Override
    public boolean order(User user, LocalDateTime from, LocalDateTime to, Product product) {

        System.out.println(user.getName() + " " + user.getSecondName() + " bought " + product.getProduct() + " for "
        + product.getPrice()+ " zł" + " on " + orderRequest.getFrom() + "." + " This order must be delivered to " + orderRequest.getTo() + ".");
        return true;
    }
}
