package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem25Test {
    private final Problem25 max1020 = new Problem25();

    @Test
    public void testBothValuesInRangeLargerLast() {
        // Given: Two integers within the range, 11 and 19
        int a = 11;
        int b = 19;

        // When: The max1020 method is called
        int result = max1020.max1020(a, b);

        // Then: The result should be 19
        assertEquals(19, result, "19 is larger and within the range of 10 to 20");
    }

    @Test
    public void testOneValueInRange() {
        // Given: One integer in range, 11, and one out of range, 9
        int a = 11;
        int b = 9;

        // When: The max1020 method is called
        int result = max1020.max1020(a, b);

        // Then: The result should be 11
        assertEquals(11, result, "11 is within the range and 9 is out of range");
    }

    @Test
    public void testBothValuesOutOfRange() {
        // Given: Two integers out of range, 9 and 25
        int a = 9;
        int b = 25;

        // When: The max1020 method is called
        int result = max1020.max1020(a, b);

        // Then: The result should be 0
        assertEquals(0, result, "Both values are out of the range of 10 to 20");
    }

    @Test
    public void testBothValuesInRangeLargerFirst() {
        // Given: Two integers within the range, 17 and 13
        int a = 17;
        int b = 13;

        // When: The max1020 method is called
        int result = max1020.max1020(a, b);

        // Then: The result should be 17
        assertEquals(17, result, "17 is larger and within the range of 10 to 20");
    }

    @Test
    public void testValuesAtRangeBoundaries() {
        // Given: Two integers at the boundaries of the range, 10 and 20
        int a = 10;
        int b = 20;

        // When: The max1020 method is called
        int result = max1020.max1020(a, b);

        // Then: The result should be 20
        assertEquals(20, result, "20 is larger and within the range of 10 to 20");
    }



}
