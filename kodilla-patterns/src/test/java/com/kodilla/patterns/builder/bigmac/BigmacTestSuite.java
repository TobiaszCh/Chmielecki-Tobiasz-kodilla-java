package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {

        //Given
        BigMac bigMac = new BigMac.BigmacBuilder()
                .setBurgers(20)
                .setBun("big")
                .setSauce("ketchup")
                .setIngredients("onion")
                .setIngredients("cheese")
                .setIngredients("chilli")
                .build();
        //When
        int result = bigMac.getIngredients().size();
        String result1 = bigMac.getBun();
        int result2 = bigMac.getBurgers();
        String result3 = bigMac.getSauce();
        //Then
        assertEquals(3, result);
        assertEquals("big", result1);
        assertEquals(20, result2);
        assertEquals("ketchup", result3);
    }
}
