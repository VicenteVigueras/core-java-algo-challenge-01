package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem16Test {

    private final Problem16 startHi = new Problem16();

    @Test
    public void testStringStartsWithHi() {
        // Given: A string that starts with "hi", "hi there"
        String str = "hi there";

        // When: The startHi method is called
        boolean result = startHi.startHi(str);

        // Then: The result should be true
        assertTrue(result, "String 'hi there' should return true as it starts with 'hi'");
    }

    @Test
    public void testStringIsOnlyHi() {
        // Given: A string that is only "hi"
        String str = "hi";

        // When: The startHi method is called
        boolean result = startHi.startHi(str);

        // Then: The result should be true
        assertTrue(result, "String 'hi' should return true as it is exactly 'hi'");
    }

    @Test
    public void testStringDoesNotStartWithHi() {
        // Given: A string that does not start with "hi", "hello hi"
        String str = "hello hi";

        // When: The startHi method is called
        boolean result = startHi.startHi(str);

        // Then: The result should be false
        assertFalse(result, "String 'hello hi' should return false as it does not start with 'hi'");
    }

    @Test
    public void testStringStartsWithHiDifferentCase() {
        // Given: A string that starts with "hi" in a different case, "Hi there"
        String str = "Hi there";

        // When: The startHi method is called
        boolean result = startHi.startHi(str);

        // Then: The result should be false
        assertFalse(result, "String 'Hi there' should return false as it does not start with 'hi' in lower case");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The startHi method is called
        boolean result = startHi.startHi(str);

        // Then: The result should be false
        assertFalse(result, "Empty string should return false as it does not start with 'hi'");
    }



}
