package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem19Test {

    private final Problem19 delDel = new Problem19();

    @Test
    public void testDelAtStartRemoved() {
        // Given: A string "adelbc"
        String str = "adelbc";

        // When: The delDel method is called
        String result = delDel.delDel(str);

        // Then: The result should be "abc"
        assertEquals("abc", result, "String 'adelbc' should return 'abc' after removing 'del'");
    }

    @Test
    public void testDelNotAtStart() {
        // Given: A string "adedbc" where 'del' is not at index 1
        String str = "adedbc";

        // When: The delDel method is called
        String result = delDel.delDel(str);

        // Then: The result should be "adedbc"
        assertEquals("adedbc", result, "String 'adedbc' should remain unchanged");
    }

    @Test
    public void testStringStartingWithDel() {
        // Given: A string "adello"
        String str = "adello";

        // When: The delDel method is called
        String result = delDel.delDel(str);

        // Then: The result should be "alo"
        assertEquals("alo", result, "String 'adello' should return 'alo' after removing 'del'");
    }

    @Test
    public void testShortStringWithDel() {
        // Given: A short string "adel"
        String str = "adel";

        // When: The delDel method is called
        String result = delDel.delDel(str);

        // Then: The result should be "a"
        assertEquals("a", result, "String 'adel' should return 'a' after removing 'del'");
    }

    @Test
    public void testEmptyString() {
        // Given: An empty string
        String str = "";

        // When: The delDel method is called
        String result = delDel.delDel(str);

        // Then: The result should be an empty string
        assertEquals("", result, "Empty string should remain unchanged");
    }


}
