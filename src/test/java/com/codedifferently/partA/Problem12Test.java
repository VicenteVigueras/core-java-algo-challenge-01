package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem12Test {

    private final Problem12 front3 = new Problem12();

    @Test
    public void testRepeatFrontThreeTimesForLongString() {
        // Given: A string longer than three characters, "Java"
        String str = "Java";

        // When: The front3 method is called
        String result = front3.front3(str);

        // Then: The result should be "JavJavJav"
        assertEquals("JavJavJav", result, "Front of 'Java' should be repeated three times");
    }

    @Test
    public void testRepeatEntireStringThreeTimesForShortString() {
        // Given: A string shorter than three characters, "Hi"
        String str = "Hi";

        // When: The front3 method is called
        String result = front3.front3(str);

        // Then: The result should be "HiHiHi"
        assertEquals("HiHiHi", result, "Entire string 'Hi' should be repeated three times");
    }

    @Test
    public void testRepeatFrontThreeTimesForExactThreeCharacterString() {
        // Given: A string with exactly three characters, "abc"
        String str = "abc";

        // When: The front3 method is called
        String result = front3.front3(str);

        // Then: The result should be "abcabcabc"
        assertEquals("abcabcabc", result, "Entire string 'abc' should be repeated three times");
    }

    @Test
    public void testRepeatSingleCharacterThreeTimes() {
        // Given: A single character string, "a"
        String str = "a";

        // When: The front3 method is called
        String result = front3.front3(str);

        // Then: The result should be "aaa"
        assertEquals("aaa", result, "Single character 'a' should be repeated three times");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The front3 method is called
        String result = front3.front3(str);

        // Then: The result should be an empty string
        assertEquals("", result, "Empty string should remain unchanged");
    }

}
