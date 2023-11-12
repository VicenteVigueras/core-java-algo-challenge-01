package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem28Test {

    private final Problem28 endUp = new Problem28();

    @Test
    public void testLastThreeCharsToUpperCase() {
        // Given: A string "Hello"
        String str = "Hello";

        // When: The endUp method is called
        String result = endUp.endUp(str);

        // Then: The result should be "HeLLO"
        assertEquals("HeLLO", result, "Last three characters should be uppercase");
    }

    @Test
    public void testStringLessThanThreeChars() {
        // Given: A string "hi"
        String str = "hi";

        // When: The endUp method is called
        String result = endUp.endUp(str);

        // Then: The result should be "HI"
        assertEquals("HI", result, "Entire string should be uppercase");
    }

    @Test
    public void testStringWithMoreThanThreeChars() {
        // Given: A string "hi there"
        String str = "hi there";

        // When: The endUp method is called
        String result = endUp.endUp(str);

        // Then: The result should be "hi thERE"
        assertEquals("hi thERE", result, "Last three characters should be uppercase");
    }

    @Test
    public void testSingleCharacterString() {
        // Given: A single character string "a"
        String str = "a";

        // When: The endUp method is called
        String result = endUp.endUp(str);

        // Then: The result should be "A"
        assertEquals("A", result, "Single character should be uppercase");
    }


}
