package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationToOrder{

    @Override
    public void inform(User user) {
        System.out.println("Your order has been placed.");
    }
}
