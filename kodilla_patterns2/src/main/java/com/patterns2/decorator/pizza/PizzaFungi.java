package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaFungi extends AbstractPizzaDecorator {

    public PizzaFungi(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + ", mushrooms";
    }
}
