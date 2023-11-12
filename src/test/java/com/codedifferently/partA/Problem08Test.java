package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem08Test {

    private final Problem08 posNeg = new Problem08();

    @Test
    public void testOnePositiveOneNegativeWithoutNegativeParam() {
        // Given: One positive and one negative number, negative param is false
        int a = 2;
        int b = -3;
        boolean negative = false;

        // When: The posNeg method is called
        boolean result = posNeg.posNeg(a, b, negative);

        // Then: The result should be true
        assertTrue(result, "Should be true if one number is positive and the other is negative");
    }


    @Test
    public void testBothNegativeWithNegativeParam() {
        // Given: Both numbers are negative, negative param is true
        int a = -6;
        int b = -8;
        boolean negative = true;

        // When: The posNeg method is called
        boolean result = posNeg.posNeg(a, b, negative);

        // Then: The result should be true
        assertTrue(result, "Should be true if both numbers are negative and negative param is true");
    }

    @Test
    public void testBothPositiveWithNegativeParam() {
        // Given: Both numbers are positive, negative param is true
        int a = 10;
        int b = 5;
        boolean negative = true;

        // When: The posNeg method is called
        boolean result = posNeg.posNeg(a, b, negative);

        // Then: The result should be false
        assertFalse(result, "Should be false if both numbers are positive and negative param is true");
    }

    @Test
    public void testZeroAndNegativeWithoutNegativeParam() {
        // Given: One number is zero, the other is negative, negative param is false
        int a = 0;
        int b = -2;
        boolean negative = false;

        // When: The posNeg method is called
        boolean result = posNeg.posNeg(a, b, negative);

        // Then: The result should be true
        assertTrue(result, "Should be true if one number is zero and the other is negative");
    }
}
