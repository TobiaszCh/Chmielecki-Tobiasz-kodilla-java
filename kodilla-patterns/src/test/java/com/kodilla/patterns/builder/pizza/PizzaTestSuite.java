package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .sauce("Spicy")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        assertEquals(1, howManyIngredients);
    }

    @Test
    void testPizzaNdew() {
    //Given
    Pizza pizza = new Pizza("D", "S", Arrays.asList("Ss", "ddd"));
        System.out.println(pizza);
    //When
    int howManyIngredients = pizza.getIngredients().size();
    //Then
    assertEquals(2, howManyIngredients);
    }
}
