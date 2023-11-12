package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem24Test {

    private final Problem24 in3050 = new Problem24();

    @Test
    public void testBothValuesWithin30To40() {
        // Given: Two integers, 30 and 31
        int a = 30;
        int b = 31;

        // When: The in3050 method is called
        boolean result = in3050.in3050(a, b);

        // Then: The result should be true
        assertTrue(result, "Both 30 and 31 are within the range of 30 to 40");
    }

    @Test
    public void testOneValueOutside30To40Range() {
        // Given: Two integers, 30 and 41
        int a = 30;
        int b = 41;

        // When: The in3050 method is called
        boolean result = in3050.in3050(a, b);

        // Then: The result should be false
        assertFalse(result, "30 is in range, but 41 is not");
    }

    @Test
    public void testBothValuesWithin40To50() {
        // Given: Two integers, 40 and 50
        int a = 40;
        int b = 50;

        // When: The in3050 method is called
        boolean result = in3050.in3050(a, b);

        // Then: The result should be true
        assertTrue(result, "Both 40 and 50 are within the range of 40 to 50");
    }

    @Test
    public void testValuesInDifferentRanges() {
        // Given: Two integers, 30 and 50
        int a = 30;
        int b = 50;

        // When: The in3050 method is called
        boolean result = in3050.in3050(a, b);

        // Then: The result should be false
        assertFalse(result, "30 and 50 are in different ranges");
    }

    @Test
    public void testOneValueOutsideBothRanges() {
        // Given: Two integers, 35 and 55
        int a = 35;
        int b = 55;

        // When: The in3050 method is called
        boolean result = in3050.in3050(a, b);

        // Then: The result should be false
        assertFalse(result, "35 is in range, but 55 is not");
    }
}
