package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem03Test {

    private Problem03 sumDouble = new Problem03();

    @Test
    public void testDifferentNumbers() {
        // Given: Two different numbers, 1 and 2
        int a = 1;
        int b = 2;

        // When: The sumDouble method is called
        int result = sumDouble.sumDouble(a, b);

        // Then: The result should be the simple sum, which is 3
        assertEquals(3, result, "Sum of 1 and 2 should be 3");
    }

    @Test
    public void testSamePositiveNumbers() {
        // Given: Two same positive numbers, 2 and 2
        int a = 2;
        int b = 2;

        // When: The sumDouble method is called
        int result = sumDouble.sumDouble(a, b);

        // Then: The result should be double their sum, which is 8
        assertEquals(8, result, "Double sum of 2 and 2 should be 8");
    }

    @Test
    public void testZeroes() {
        // Given: Both numbers are 0
        int a = 0;
        int b = 0;

        // When: The sumDouble method is called
        int result = sumDouble.sumDouble(a, b);

        // Then: The result should be 0
        assertEquals(0, result, "Sum of 0 and 0 should be 0");
    }

    @Test
    public void testSameNegativeNumbers() {
        // Given: Two same negative numbers, -1 and -1
        int a = -1;
        int b = -1;

        // When: The sumDouble method is called
        int result = sumDouble.sumDouble(a, b);

        // Then: The result should be double their sum, which is -4
        assertEquals(-4, result, "Double sum of -1 and -1 should be -4");
    }


}
