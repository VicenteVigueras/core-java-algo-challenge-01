package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem11Test {

    private final Problem11 frontBack = new Problem11();

    @Test
    public void testExchangeFirstAndLastCharacters() {
        // Given: A string "code"
        String str = "code";

        // When: The frontBack method is called
        String result = frontBack.frontBack(str);

        // Then: The result should be "eodc"
        assertEquals("eodc", result, "First and last characters should be exchanged in 'code'");
    }

    @Test
    public void testSingleCharacterString() {
        // Given: A single character string "a"
        String str = "a";

        // When: The frontBack method is called
        String result = frontBack.frontBack(str);

        // Then: The result should be "a"
        assertEquals("a", result, "Single character string should remain unchanged");
    }

    @Test
    public void testTwoCharacterString() {
        // Given: A two-character string "ab"
        String str = "ab";

        // When: The frontBack method is called
        String result = frontBack.frontBack(str);

        // Then: The result should be "ba"
        assertEquals("ba", result, "First and last characters should be exchanged in 'ab'");
    }

    @Test
    public void testLongString() {
        // Given: A longer string "hello"
        String str = "hello";

        // When: The frontBack method is called
        String result = frontBack.frontBack(str);

        // Then: The result should be "oellh"
        assertEquals("oellh", result, "First and last characters should be exchanged in 'hello'");
    }

    @Test
    public void testStringWithSpecialCharacters() {
        // Given: A string with special characters "cat!"
        String str = "cat!";

        // When: The frontBack method is called
        String result = frontBack.frontBack(str);

        // Then: The result should be "!atc"
        assertEquals("!atc", result, "First and last characters should be exchanged in 'cat!'");
    }


}
