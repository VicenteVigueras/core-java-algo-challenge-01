package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem20Test {

    private final Problem20 mixStart = new Problem20();

    @Test
    public void testStringBeginsWithMix() {
        // Given: A string "mix snacks"
        String str = "mix snacks";

        // When: The mixStart method is called
        boolean result = mixStart.mixStart(str);

        // Then: The result should be true
        assertTrue(result, "String 'mix snacks' should return true as it begins with 'mix'");
    }

    @Test
    public void testStringBeginsWithOtherCharAndIx() {
        // Given: A string "pix snacks" where 'p' replaces the first character
        String str = "pix snacks";

        // When: The mixStart method is called
        boolean result = mixStart.mixStart(str);

        // Then: The result should be true
        assertTrue(result, "String 'pix snacks' should return true as it begins with 'pix'");
    }

    @Test
    public void testStringDoesNotBeginWithIx() {
        // Given: A string "piz snacks" that does not begin with 'ix' after the first character
        String str = "piz snacks";

        // When: The mixStart method is called
        boolean result = mixStart.mixStart(str);

        // Then: The result should be false
        assertFalse(result, "String 'piz snacks' should return false as it does not begin with 'ix'");
    }

    @Test
    public void testStringWithRandomCharAndIx() {
        // Given: A string "9ix snacks" where '9' replaces the first character
        String str = "9ix snacks";

        // When: The mixStart method is called
        boolean result = mixStart.mixStart(str);

        // Then: The result should be true
        assertTrue(result, "String '9ix snacks' should return true as it begins with '9ix'");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The mixStart method is called
        boolean result = mixStart.mixStart(str);

        // Then: The result should be false
        assertFalse(result, "Empty string should return false as it does not start with 'ix'");
    }

}
