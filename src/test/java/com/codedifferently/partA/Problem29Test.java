package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem29Test {
    private final Problem29 everyNth = new Problem29();

    @Test
    public void testEverySecondCharacter() {
        // Given: A string "Miracle" and N = 2
        String str = "Miracle";
        int n = 2;

        // When: The everyNth method is called
        String result = everyNth.everyNth(str, n);

        // Then: The result should be "Mrce"
        assertEquals("Mrce", result, "Should select every 2nd character");
    }

    @Test
    public void testEveryThirdCharacter() {
        // Given: A string "abcdefg" and N = 3
        String str = "abcdefg";
        int n = 3;

        // When: The everyNth method is called
        String result = everyNth.everyNth(str, n);

        // Then: The result should be "adg"
        assertEquals("adg", result, "Should select every 3rd character");
    }

    @Test
    public void testEveryCharacter() {
        // Given: A string "abcdefghij" and N = 1
        String str = "abcdefghij";
        int n = 1;

        // When: The everyNth method is called
        String result = everyNth.everyNth(str, n);

        // Then: The result should be the same as the original string
        assertEquals("abcdefghij", result, "Should select every character");
    }




    @Test
    public void testNthCharacterGreaterThanStringLength() {
        // Given: A string "abcdefg" and N = 7
        String str = "abcdefg";
        int n = 7;

        // When: The everyNth method is called
        String result = everyNth.everyNth(str, n);

        // Then: The result should be "a"
        assertEquals("a", result, "Should select only the first character");
    }
}
