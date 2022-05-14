package com.kodilla.springe.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.springe");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(3, 5);
        double result2 = calculator.sub(8, 5);
        double result3 = calculator.mul(6, 2);
        double result4 = calculator.div(15, 5);
        //Then
        assertEquals(result1, 8);
        assertEquals(result2, 3);
        assertNotEquals(result3, 8);
        assertNotEquals(result4, 8);




    }
}
