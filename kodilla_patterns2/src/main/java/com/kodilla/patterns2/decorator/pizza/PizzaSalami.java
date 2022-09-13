package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSalami extends AbstractPizzaDecorator{

    public PizzaSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(13));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + ", salami, pepper";
    }
}
