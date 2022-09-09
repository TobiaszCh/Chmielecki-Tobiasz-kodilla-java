package com.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testPizzaCapriciosa() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaCapriciosa(pizza);
        // When
        String description = pizza.getDescribe();
        BigDecimal price = pizza.getCost();
        // Then
        assertEquals("Pizza with: tomato sauce, cheese, mushrooms, ham", description);
        assertEquals(new BigDecimal(25), price);
    }

    @Test
    void testPizzaSalami() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaSalami(pizza);
        // When
        String description = pizza.getDescribe();
        BigDecimal price = pizza.getCost();
        // Then
        assertEquals("Pizza with: tomato sauce, cheese, salami, pepper", description);
        assertEquals(new BigDecimal(28), price);
    }

    @Test
    void testPizzaFungi() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaFungi(pizza);
        // When
        String description = pizza.getDescribe();
        BigDecimal price = pizza.getCost();
        // Then
        assertEquals("Pizza with: tomato sauce, cheese, mushrooms", description);
        assertEquals(new BigDecimal(20), price);
    }

    @Test
    void testPizzaVip() {
        // Given
        Pizza pizza = new BasicPizza();
        pizza = new PizzaCapriciosa(pizza);
        pizza = new PizzaSalami(pizza);
        pizza = new PizzaVip(pizza);
        // When
        String description = pizza.getDescribe();
        BigDecimal price = pizza.getCost();
        // Then
        assertEquals("Pizza with: tomato sauce, cheese, mushrooms, ham, salami, pepper", description);
        assertEquals(new BigDecimal(38), price);
    }
}
