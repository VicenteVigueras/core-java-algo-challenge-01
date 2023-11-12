package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem07Test {

    private final Problem07 nearHundred = new Problem07();

    @Test
    public void testNear100Within10() {
        // Given: A number within 10 units of 100, for example, 93
        int n = 93;

        // When: The nearHundred method is called
        boolean result = nearHundred.nearHundred(n);

        // Then: The result should be true
        assertTrue(result, "93 is within 10 units of 100");
    }

    @Test
    public void testExactly100() {
        // Given: The number is exactly 100
        int n = 100;

        // When: The nearHundred method is called
        boolean result = nearHundred.nearHundred(n);

        // Then: The result should be true
        assertTrue(result, "100 is exactly 100 units away from 100");
    }

    @Test
    public void testNear200Within10() {
        // Given: A number within 10 units of 200, for example, 190
        int n = 190;

        // When: The nearHundred method is called
        boolean result = nearHundred.nearHundred(n);

        // Then: The result should be true
        assertTrue(result, "190 is within 10 units of 200");
    }

    @Test
    public void testNotWithin10OfEither() {
        // Given: A number not within 10 units of 100 or 200, for example, 89
        int n = 89;

        // When: The nearHundred method is called
        boolean result = nearHundred.nearHundred(n);

        // Then: The result should be false
        assertFalse(result, "89 is not within 10 units of 100 or 200");
    }

    @Test
    public void testBoundaryCase() {
        // Given: A boundary number like 111, which is not within 10 units of 100 or 200
        int n = 111;

        // When: The nearHundred method is called
        boolean result = nearHundred.nearHundred(n);

        // Then: The result should be false
        assertFalse(result, "111 is not within 10 units of 100 or 200");
    }
}
