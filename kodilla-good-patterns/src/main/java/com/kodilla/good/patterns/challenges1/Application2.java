package com.kodilla.good.patterns.challenges1;

public class Application2 {

    public static void main(String[] args) {
        OrderRequestRetriever rentRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = rentRequestRetriever.retrieve();
        OrderFood2DoorProcessor orderFood2DoorProcessor = new OrderFood2DoorProcessor(new FoodEmailService(), new FoodOrderService(), new FoodOrderRepository());
        orderFood2DoorProcessor.existProcess(orderRequest);
    }
}
