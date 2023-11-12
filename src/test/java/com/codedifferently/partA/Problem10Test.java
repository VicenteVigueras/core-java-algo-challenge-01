package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem10Test {

    private final Problem10 missingChar = new Problem10();

    @Test
    public void testRemoveCharacterFromMiddle() {
        // Given: A string "kitten" and an index 1
        String str = "kitten";
        int n = 1;

        // When: The missingChar method is called
        String result = missingChar.missingChar(str, n);

        // Then: The result should be "ktten"
        assertEquals("ktten", result, "Character at index 1 should be removed from 'kitten'");
    }

    @Test
    public void testRemoveFirstCharacter() {
        // Given: A string "kitten" and an index 0
        String str = "kitten";
        int n = 0;

        // When: The missingChar method is called
        String result = missingChar.missingChar(str, n);

        // Then: The result should be "itten"
        assertEquals("itten", result, "First character should be removed from 'kitten'");
    }

    @Test
    public void testRemoveLastCharacter() {
        // Given: A string "kitten" and an index 4
        String str = "kitten";
        int n = 4;

        // When: The missingChar method is called
        String result = missingChar.missingChar(str, n);

        // Then: The result should be "kittn"
        assertEquals("kittn", result, "Character at index 4 should be removed from 'kitten'");
    }



    @Test
    public void testRemoveCharacterFromDifferentString() {
        // Given: A different string "apple" and an index 0
        String str = "apple";
        int n = 0;

        // When: The missingChar method is called
        String result = missingChar.missingChar(str, n);

        // Then: The result should be "pple"
        assertEquals("pple", result, "First character should be removed from 'apple'");
    }

}
