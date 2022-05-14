package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] tab = {2, 4, 6, 8, 10, 12, 15, 16, 17, 20, 30, 31, 32, 34, 36, 40, 41, 42, 46, 49};
        //When
        double optionalDouble = ArrayOperations.getAverage(tab);
        //then
        assertEquals(24.55, optionalDouble);
    }

}
