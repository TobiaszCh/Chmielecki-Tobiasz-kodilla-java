package com.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCapriciosa extends AbstractPizzaDecorator {

    public PizzaCapriciosa(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + ", mushrooms, ham";
    }
}
