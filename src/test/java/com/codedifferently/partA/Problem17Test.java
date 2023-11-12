package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem17Test {
    private final Problem17 icyHot = new Problem17();

    @Test
    public void testOneTemperatureBelowZeroAndOtherAboveHundred() {
        // Given: Two temperatures, one below zero and the other above 100, such as -1 and 120
        int temp1 = -1;
        int temp2 = 120;

        // When: The icyHot method is called
        boolean result = icyHot.icyHot(temp1, temp2);

        // Then: The result should be true
        assertTrue(result, "Should return true for temperatures -1 and 120");
    }

    @Test
    public void testBothTemperaturesNotMeetingCriteria() {
        // Given: Two temperatures, both not meeting the icy hot criteria, such as 2 and 120
        int temp1 = 2;
        int temp2 = 120;

        // When: The icyHot method is called
        boolean result = icyHot.icyHot(temp1, temp2);

        // Then: The result should be false
        assertFalse(result, "Should return false for temperatures 2 and 120");
    }

    @Test
    public void testOneTemperatureExactlyZero() {
        // Given: One temperature is exactly 0 and the other above 100, such as 0 and 101
        int temp1 = 0;
        int temp2 = 101;

        // When: The icyHot method is called
        boolean result = icyHot.icyHot(temp1, temp2);

        // Then: The result should be false
        assertFalse(result, "Should return false for temperatures 0 and 101");
    }

    @Test
    public void testNegativeAndPositiveTemperatures() {
        // Given: Two temperatures, one negative and the other positive but not above 100, such as -2 and 99
        int temp1 = -2;
        int temp2 = 99;

        // When: The icyHot method is called
        boolean result = icyHot.icyHot(temp1, temp2);

        // Then: The result should be false
        assertFalse(result, "Should return false for temperatures -2 and 99");
    }

    @Test
    public void testBothTemperaturesBelowZero() {
        // Given: Both temperatures below zero, such as -50 and -20
        int temp1 = -50;
        int temp2 = -20;

        // When: The icyHot method is called
        boolean result = icyHot.icyHot(temp1, temp2);

        // Then: The result should be false
        assertFalse(result, "Should return false for temperatures -50 and -20");
    }

}
