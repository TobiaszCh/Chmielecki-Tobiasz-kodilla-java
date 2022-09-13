package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaVip extends AbstractPizzaDecorator{

    public PizzaVip(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }
}
