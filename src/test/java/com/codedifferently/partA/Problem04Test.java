package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem04Test {

    private final Problem04 diff21 = new Problem04();

    @Test
    public void testNumberLessThan21() {
        // Given: A number less than 21, for example, 19
        int n = 19;

        // When: The diff21 method is called
        int result = diff21.diff21(n);

        // Then: The result should be the absolute difference, which is 2
        assertEquals(2, result, "Absolute difference between 19 and 21 should be 2");
    }

    @Test
    public void testNumberGreaterThan21() {
        // Given: A number greater than 21, for example, 25
        int n = 25;

        // When: The diff21 method is called
        int result = diff21.diff21(n);

        // Then: The result should be double the absolute difference, which is 8
        assertEquals(8, result, "Double the absolute difference between 25 and 21 should be 8");
    }

    @Test
    public void testNumberIs21() {
        // Given: The number is exactly 21
        int n = 21;

        // When: The diff21 method is called
        int result = diff21.diff21(n);

        // Then: The result should be 0
        assertEquals(0, result, "Difference when the number is 21 should be 0");
    }

    @Test
    public void testNumberIsFarGreaterThan21() {
        // Given: A number far greater than 21, for example, 50
        int n = 50;

        // When: The diff21 method is called
        int result = diff21.diff21(n);

        // Then: The result should be double the absolute difference, which is 58
        assertEquals(58, result, "Double the absolute difference between 50 and 21 should be 58");
    }

    @Test
    public void testNumberIsSlightlyLessThan21() {
        // Given: A number slightly less than 21, for example, 15
        int n = 15;

        // When: The diff21 method is called
        int result = diff21.diff21(n);

        // Then: The result should be the absolute difference, which is 6
        assertEquals(6, result, "Absolute difference between 15 and 21 should be 6");
    }

}
