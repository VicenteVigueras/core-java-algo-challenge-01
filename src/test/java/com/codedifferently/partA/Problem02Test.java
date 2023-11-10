package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem02Test {

    private Problem02 problem02 = new Problem02();
    @Test
    public void testBothMonkeysSmiling() {
        // Given: Both monkeys are smiling
        boolean aSmile = true;
        boolean bSmile = true;

        // When: The monkeyTrouble method is called
        boolean result = problem02.monkeyTrouble(aSmile, bSmile);

        // Then: The result should be true, indicating trouble
        assertTrue(result, "Both monkeys are smiling - should be trouble");
    }

    @Test
    public void testNeitherMonkeySmiling() {
        // Given: Neither monkey is smiling
        boolean aSmile = false;
        boolean bSmile = false;

        // When: The monkeyTrouble method is called
        boolean result = problem02.monkeyTrouble(aSmile, bSmile);

        // Then: The result should be true, indicating trouble
        assertTrue(result, "Neither monkey is smiling - should be trouble");
    }

    @Test
    public void testOnlyFirstMonkeySmiling() {
        // Given: Only the first monkey is smiling
        boolean aSmile = true;
        boolean bSmile = false;

        // When: The monkeyTrouble method is called
        boolean result =problem02.monkeyTrouble(aSmile, bSmile);

        // Then: The result should be false, indicating no trouble
        assertFalse(result, "Only the first monkey is smiling - should not be trouble");
    }

    @Test
    public void testOnlySecondMonkeySmiling() {
        // Given: Only the second monkey is smiling
        boolean aSmile = false;
        boolean bSmile = true;

        // When: The monkeyTrouble method is called
        boolean result = problem02.monkeyTrouble(aSmile, bSmile);

        // Then: The result should be false, indicating no trouble
        assertFalse(result, "Only the second monkey is smiling - should not be trouble");
    }

    // Additional test case based on your requirements
    @Test
    public void testBothMonkeysNotSmilingAgain() {
        // Given: Both monkeys are not smiling
        boolean aSmile = false;
        boolean bSmile = false;

        // When: The monkeyTrouble method is called
        boolean result = problem02.monkeyTrouble(aSmile, bSmile);

        // Then: The result should be true, indicating trouble
        assertTrue(result, "Both monkeys are not smiling - should be trouble");
    }


}
