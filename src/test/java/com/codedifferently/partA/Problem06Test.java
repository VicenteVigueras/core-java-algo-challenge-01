package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem06Test {

    private final Problem06 makes10 = new Problem06();

    @Test
    public void testOneNumberIs10() {
        // Given: One of the numbers is 10, for example, a is 9 and b is 10
        int a = 9;
        int b = 10;

        // When: The makes10 method is called
        boolean result = makes10.makes10(a, b);

        // Then: The result should be true
        assertTrue(result, "Should be true if one of the numbers is 10");
    }

    @Test
    public void testNeitherNumberIs10NorTheirSum() {
        // Given: Neither of the numbers is 10 and their sum is not 10, for example, a is 9 and b is 9
        int a = 9;
        int b = 9;

        // When: The makes10 method is called
        boolean result = makes10.makes10(a, b);

        // Then: The result should be false
        assertFalse(result, "Should be false if neither number is 10 nor their sum");
    }

    @Test
    public void testSumEquals10() {
        // Given: The sum of the numbers equals 10, for example, a is 1 and b is 9
        int a = 1;
        int b = 9;

        // When: The makes10 method is called
        boolean result = makes10.makes10(a, b);

        // Then: The result should be true
        assertTrue(result, "Should be true if the sum of the numbers equals 10");
    }

    @Test
    public void testBothNumbersNot10ButSumIs10() {
        // Given: Neither number is 10, but their sum is 10, for example, a is 8 and b is 2
        int a = 8;
        int b = 2;

        // When: The makes10 method is called
        boolean result = makes10.makes10(a, b);

        // Then: The result should be true
        assertTrue(result, "Should be true if the sum of the numbers equals 10");
    }

    @Test
    public void testNegativeNumberButSumIs10() {
        // Given: One of the numbers is negative, but their sum equals 10, for example, a is 11 and b is -1
        int a = 11;
        int b = -1;

        // When: The makes10 method is called
        boolean result = makes10.makes10(a, b);

        // Then: The result should be true
        assertTrue(result, "Should be true if the sum of the numbers equals 10");
    }



}
