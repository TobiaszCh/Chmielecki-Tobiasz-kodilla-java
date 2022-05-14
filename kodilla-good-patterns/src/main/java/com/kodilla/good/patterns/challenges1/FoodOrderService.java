package com.kodilla.good.patterns.challenges1;
import java.time.LocalDateTime;

public class FoodOrderService implements OrderService {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderRequest = orderRequestRetriever.retrieve();

    @Override
    public void order(Customer user, LocalDateTime from, Product product) {
        System.out.println(user.getName() + " " + user.getSecondName() + " bought " + product.getName()  + " on " + orderRequest.getTo() + ". " + "These products were "
        + product.getQuantity()+ " pieces. ");
    }
}
