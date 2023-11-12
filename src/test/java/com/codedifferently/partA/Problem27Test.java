package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem27Test {

    private final Problem27 lastDigit = new Problem27();

    @Test
    public void testSameLastDigit() {
        // Given: Two integers, 7 and 17
        int a = 7;
        int b = 17;

        // When: The lastDigit method is called
        boolean result = lastDigit.lastDigit(a, b);

        // Then: The result should be true
        assertTrue(result, "Both 7 and 17 have the same last digit");
    }

    @Test
    public void testDifferentLastDigit() {
        // Given: Two integers, 6 and 17
        int a = 6;
        int b = 17;

        // When: The lastDigit method is called
        boolean result = lastDigit.lastDigit(a, b);

        // Then: The result should be false
        assertFalse(result, "6 and 17 have different last digits");
    }

    @Test
    public void testLastDigitWithZero() {
        // Given: Two integers, 50 and 100
        int a = 50;
        int b = 100;

        // When: The lastDigit method is called
        boolean result = lastDigit.lastDigit(a, b);

        // Then: The result should be true
        assertTrue(result, "Both 50 and 100 end with the digit 0");
    }

    @Test
    public void testLastDigitWithRepeatedNumbers() {
        // Given: Two integers, 99 and 999
        int a = 99;
        int b = 999;

        // When: The lastDigit method is called
        boolean result = lastDigit.lastDigit(a, b);

        // Then: The result should be true
        assertTrue(result, "99 and 999 end with the same digit");
    }

    @Test
    public void testCompletelyDifferentNumbers() {
        // Given: Two integers, 123 and 456
        int a = 123;
        int b = 456;

        // When: The lastDigit method is called
        boolean result = lastDigit.lastDigit(a, b);

        // Then: The result should be false
        assertFalse(result, "123 and 456 end with different digits");
    }
}
