package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem23Test {

    private final Problem23 close10 = new Problem23();

    @Test
    public void testOneValueCloserToTen() {
        // Given: Two integers, 8 and 13
        int a = 8;
        int b = 13;

        // When: The close10 method is called
        int result = close10.close10(a, b);

        // Then: The result should be 8
        assertEquals(8, result, "8 is closer to 10 than 13");
    }

    @Test
    public void testTieShouldReturnZero() {
        // Given: Two integers, 10 and 20
        int a = 10;
        int b = 20;

        // When: The close10 method is called
        int result = close10.close10(a, b);

        // Then: The result should be 10
        assertEquals(10, result, "When it's a tie, return 0");
    }

    @Test
    public void testBothValuesEquallyClose() {
        // Given: Two integers, 0 and 10
        int a = 0;
        int b = 10;

        // When: The close10 method is called
        int result = close10.close10(a, b);

        // Then: The result should be 10
        assertEquals(10, result, "10 is closer to 10 than 0");
    }

    @Test
    public void testOtherValueCloserToTen() {
        // Given: Two integers, 15 and 8
        int a = 15;
        int b = 8;

        // When: The close10 method is called
        int result = close10.close10(a, b);

        // Then: The result should be 8
        assertEquals(8, result, "8 is closer to 10 than 15");
    }

    @Test
    public void testClosestValueToTen() {
        // Given: Two integers, 11 and 12
        int a = 11;
        int b = 12;

        // When: The close10 method is called
        int result = close10.close10(a, b);

        // Then: The result should be 11
        assertEquals(11, result, "11 is closer to 10 than 12");
    }
}
