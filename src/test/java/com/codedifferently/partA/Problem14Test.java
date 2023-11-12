package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem14Test {

    private final Problem14 front22 = new Problem14();

    @Test
    public void testAddFirstTwoCharactersToFrontAndBack() {
        // Given: A string "kitten"
        String str = "kitten";

        // When: The front22 method is called
        String result = front22.front22(str);

        // Then: The result should be "kikittenki"
        assertEquals("kikittenki", result, "First two characters should be added to front and back of 'kitten'");
    }

    @Test
    public void testStringWithTwoCharacters() {
        // Given: A two-character string "Ha"
        String str = "Ha";

        // When: The front22 method is called
        String result = front22.front22(str);

        // Then: The result should be "HaHaHa"
        assertEquals("HaHaHa", result, "String 'Ha' should be repeated three times");
    }

    @Test
    public void testSingleCharacterString() {
        // Given: A single character string "H"
        String str = "H";

        // When: The front22 method is called
        String result = front22.front22(str);

        // Then: The result should be "HHH"
        assertEquals("HHH", result, "Single character 'H' should be repeated three times");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The front22 method is called
        String result = front22.front22(str);

        // Then: The result should be an empty string
        assertEquals("", result, "Empty string should remain unchanged");
    }

    @Test
    public void testLongString() {
        // Given: A longer string "coding"
        String str = "coding";

        // When: The front22 method is called
        String result = front22.front22(str);

        // Then: The result should be "cocodingco"
        assertEquals("cocodingco", result, "First two characters should be added to front and back of 'coding'");
    }


}
