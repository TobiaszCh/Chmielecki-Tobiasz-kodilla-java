package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements Pizza {

    private final Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescribe() {
        return pizza.getDescribe();
    }
}