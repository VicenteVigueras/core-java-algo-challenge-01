package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem15Test {

    private final Problem15 or35 = new Problem15();

    @Test
    public void testMultipleOfThree() {
        // Given: A number 9, which is a multiple of 3
        int n = 9;

        // When: The or35 method is called
        boolean result = or35.or35(n);

        // Then: The result should be true
        assertTrue(result, "9 should return true as it is a multiple of 3");
    }

    @Test
    public void testMultipleOfFive() {
        // Given: A number 10, which is a multiple of 5
        int n = 10;

        // When: The or35 method is called
        boolean result = or35.or35(n);

        // Then: The result should be true
        assertTrue(result, "10 should return true as it is a multiple of 5");
    }



    @Test
    public void testNumberIsMultipleOfBothThreeAndFive() {
        // Given: A number 15, which is a multiple of both 3 and 5
        int n = 15;

        // When: The or35 method is called
        boolean result = or35.or35(n);

        // Then: The result should be true
        assertTrue(result, "15 should return true as it is a multiple of both 3 and 5");
    }

    @Test
    public void testZero() {
        // Given: The number 0, which is technically a multiple of any number
        int n = 0;

        // When: The or35 method is called
        boolean result = or35.or35(n);

        // Then: The result should be true
        assertTrue(result, "0 should return true as it is a multiple of both 3 and 5");
    }


}
