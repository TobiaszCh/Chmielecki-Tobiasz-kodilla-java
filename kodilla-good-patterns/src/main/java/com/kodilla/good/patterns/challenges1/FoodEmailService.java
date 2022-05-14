package com.kodilla.good.patterns.challenges1;

public class FoodEmailService implements InformationToOrder {

    @Override
    public void inform(Customer user) {
        System.out.println("Your order has been placed.");
    }
}
