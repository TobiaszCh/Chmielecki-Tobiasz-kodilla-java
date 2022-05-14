package com.kodilla.good.patterns.challenges;

public class Application1 {

    public static void main(String[] args) {


        OrderRequestRetriever rentRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = rentRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new EmailService(), new PhoneOrderService(), new PhoneOrderRepository());

        orderProcessor.process(orderRequest);

    }
}

