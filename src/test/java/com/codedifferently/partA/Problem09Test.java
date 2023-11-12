package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem09Test {

    private final Problem09 notString = new Problem09();

    @Test
    public void testStringDoesNotStartWithNot() {
        // Given: A string that does not start with "not", for example, "candy"
        String str = "candy";

        // When: The notString method is called
        String result = notString.notString(str);

        // Then: The result should be the string prepended with "not "
        assertEquals("not candy", result, "String 'candy' should be modified to 'not candy'");
    }

    @Test
    public void testStringStartsWithNot() {
        // Given: A string that starts with "not", for example, "not bad"
        String str = "not bad";

        // When: The notString method is called
        String result = notString.notString(str);

        // Then: The result should be the string unchanged
        assertEquals("not bad", result, "String 'not bad' should not be modified");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The notString method is called
        String result = notString.notString(str);

        // Then: The result should be "not " (just the word "not" and a space)
        assertEquals("not ", result, "Empty string should be modified to 'not '");
    }

    @Test
    public void testStringIsSingleCharacter() {
        // Given: A string that is a single character, for example, "x"
        String str = "x";

        // When: The notString method is called
        String result = notString.notString(str);

        // Then: The result should be the string prepended with "not "
        assertEquals("not x", result, "String 'x' should be modified to 'not x'");
    }

    @Test
    public void testStringAlreadyNot() {
        // Given: A string that already contains "not" as a word, for example, "notepad"
        String str = "notepad";

        // When: The notString method is called
        String result = notString.notString(str);

        // Then: The result should be the string unchanged
        assertEquals("notepad", result, "String 'notepad' should not be modified");
    }
}
