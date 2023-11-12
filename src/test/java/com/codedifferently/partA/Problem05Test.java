package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem05Test {

    private final Problem05 parrotTrouble = new Problem05();

    @Test
    public void testTalkingBefore7AM() {
        // Given: The parrot is talking and the hour is before 7 AM
        boolean talking = true;
        int hour = 6;

        // When: The parrotTrouble method is called
        boolean result = parrotTrouble.parrotTrouble(talking, hour);

        // Then: We should be in trouble
        assertTrue(result, "Should be in trouble if talking before 7 AM");
    }

    @Test
    public void testTalkingAfter7AM() {
        // Given: The parrot is talking and the hour is after 7 AM
        boolean talking = true;
        int hour = 7;

        // When: The parrotTrouble method is called
        boolean result = parrotTrouble.parrotTrouble(talking, hour);

        // Then: We should not be in trouble
        assertFalse(result, "Should not be in trouble if talking after 7 AM");
    }

    @Test
    public void testNotTalkingBefore7AM() {
        // Given: The parrot is not talking and the hour is before 7 AM
        boolean talking = false;
        int hour = 6;

        // When: The parrotTrouble method is called
        boolean result = parrotTrouble.parrotTrouble(talking, hour);

        // Then: We should not be in trouble
        assertFalse(result, "Should not be in trouble if not talking before 7 AM");
    }

    @Test
    public void testTalkingAfter8PM() {
        // Given: The parrot is talking and the hour is after 8 PM
        boolean talking = true;
        int hour = 21;

        // When: The parrotTrouble method is called
        boolean result = parrotTrouble.parrotTrouble(talking, hour);

        // Then: We should be in trouble
        assertTrue(result, "Should be in trouble if talking after 8 PM");
    }

    @Test
    public void testNotTalkingAfter8PM() {
        // Given: The parrot is not talking and the hour is after 8 PM
        boolean talking = false;
        int hour = 22;

        // When: The parrotTrouble method is called
        boolean result = parrotTrouble.parrotTrouble(talking, hour);

        // Then: We should not be in trouble
        assertFalse(result, "Should not be in trouble if not talking after 8 PM");
    }
}
