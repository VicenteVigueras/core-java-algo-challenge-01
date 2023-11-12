package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem21Test {

    private final Problem21 startOz = new Problem21();

    @Test
    public void testStringStartsWithOz() {
        // Given: A string "ozymandias"
        String str = "ozymandias";

        // When: The startOz method is called
        String result = startOz.startOz(str);

        // Then: The result should be "oz"
        assertEquals("oz", result, "String 'ozymandias' should return 'oz'");
    }

    @Test
    public void testStringStartsWithOButNotZ() {
        // Given: A string "oxx"
        String str = "oxx";

        // When: The startOz method is called
        String result = startOz.startOz(str);

        // Then: The result should be "o"
        assertEquals("o", result, "String 'oxx' should return 'o'");
    }

    @Test
    public void testStringStartsWithZButNotO() {
        // Given: A string "bzoo"
        String str = "bzoo";

        // When: The startOz method is called
        String result = startOz.startOz(str);

        // Then: The result should be "z"
        assertEquals("z", result, "String 'bzoo' should return 'z'");
    }



    @Test
    public void testStringWithOzInMiddle() {
        // Given: A string "booz"
        String str = "booz";

        // When: The startOz method is called
        String result = startOz.startOz(str);

        // Then: The result should be an empty string
        assertEquals("", result, "String 'booz' should return an empty string");
    }


    }


