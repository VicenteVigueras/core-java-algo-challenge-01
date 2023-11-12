package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem13Test {
    private final Problem13 backAround = new Problem13();

    @Test
    public void testLastCharacterAddedToFrontAndBack() {
        // Given: A string "cat"
        String str = "cat";

        // When: The backAround method is called
        String result = backAround.backAround(str);

        // Then: The result should be "tcatt"
        assertEquals("tcatt", result, "Last character should be added to front and back of 'cat'");
    }

    @Test
    public void testSingleCharacterString() {
        // Given: A single character string "a"
        String str = "a";

        // When: The backAround method is called
        String result = backAround.backAround(str);

        // Then: The result should be "aaa"
        assertEquals("aaa", result, "Single character 'a' should be repeated three times");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The backAround method is called
        String result = backAround.backAround(str);

        // Then: The result should be an empty string
        assertEquals("", result, "Empty string should remain unchanged");
    }

    @Test
    public void testLongString() {
        // Given: A longer string "Hello"
        String str = "Hello";

        // When: The backAround method is called
        String result = backAround.backAround(str);

        // Then: The result should be "oHelloo"
        assertEquals("oHelloo", result, "Last character should be added to front and back of 'Hello'");
    }



}
