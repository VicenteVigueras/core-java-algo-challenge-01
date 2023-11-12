package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem26Test {
    private final Problem26 stringE = new Problem26();

    @Test
    public void testOneOccurrenceOfE() {
        // Given: A string "Hello"
        String str = "Hello";

        // When: The stringE method is called
        boolean result = stringE.stringE(str);

        // Then: The result should be true
        assertTrue(result, "String 'Hello' contains one 'e'");
    }

    @Test
    public void testThreeOccurrencesOfE() {
        // Given: A string "Heelle"
        String str = "Heelle";

        // When: The stringE method is called
        boolean result = stringE.stringE(str);

        // Then: The result should be true
        assertTrue(result, "String 'Heelle' contains three 'e's");
    }

    @Test
    public void testMoreThanThreeOccurrencesOfE() {
        // Given: A string "Heelele"
        String str = "Heelele";

        // When: The stringE method is called
        boolean result = stringE.stringE(str);

        // Then: The result should be false
        assertFalse(result, "String 'Heelele' contains more than three 'e's");
    }

    @Test
    public void testNoOccurrencesOfE() {
        // Given: A string "cat"
        String str = "cat";

        // When: The stringE method is called
        boolean result = stringE.stringE(str);

        // Then: The result should be false
        assertFalse(result, "String 'cat' does not contain 'e'");
    }



}
