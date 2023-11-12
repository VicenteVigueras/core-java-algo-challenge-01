package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem22Test {
    private final Problem22 intMax = new Problem22();

    @Test
    public void testMaxOfThreeDifferentValues() {
        // Given: Three different integers, 1, 2, and 3
        int a = 1;
        int b = 2;
        int c = 3;

        // When: The intMax method is called
        int result = intMax.intMax(a, b, c);

        // Then: The result should be 3
        assertEquals(3, result, "Max of 1, 2, and 3 should be 3");
    }

    @Test
    public void testMaxWithNegativeValues() {
        // Given: Three integers with negative values, -1, -5, and -3
        int a = -1;
        int b = -5;
        int c = -3;

        // When: The intMax method is called
        int result = intMax.intMax(a, b, c);

        // Then: The result should be -1
        assertEquals(-1, result, "Max of -1, -5, and -3 should be -1");
    }

    @Test
    public void testMaxWithAllValuesEqual() {
        // Given: Three equal integers, 0, 0, and 0
        int a = 0;
        int b = 0;
        int c = 0;

        // When: The intMax method is called
        int result = intMax.intMax(a, b, c);

        // Then: The result should be 0
        assertEquals(0, result, "Max of 0, 0, and 0 should be 0");
    }

    @Test
    public void testMaxWithLargeValues() {
        // Given: Three integers, 100, 200, and 150
        int a = 100;
        int b = 200;
        int c = 150;

        // When: The intMax method is called
        int result = intMax.intMax(a, b, c);

        // Then: The result should be 200
        assertEquals(200, result, "Max of 100, 200, and 150 should be 200");
    }

    @Test
    public void testMaxWithMixedSignValues() {
        // Given: Three integers with mixed signs, -10, 0, and 10
        int a = -10;
        int b = 0;
        int c = 10;

        // When: The intMax method is called
        int result = intMax.intMax(a, b, c);

        // Then: The result should be 10
        assertEquals(10, result, "Max of -10, 0, and 10 should be 10");
    }

}
