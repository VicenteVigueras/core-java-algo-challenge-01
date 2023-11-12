package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem18Test {
    private final Problem18 loneTeen = new Problem18();

    @Test
    public void testOneTeenAndOneNotTeen() {
        // Given: One teen number 13 and one not teen number 99
        int a = 13;
        int b = 99;

        // When: The loneTeen method is called
        boolean result = loneTeen.loneTeen(a, b);

        // Then: The result should be true
        assertTrue(result, "Should return true for one teen (13) and one not teen (99)");
    }

    @Test
    public void testBothNumbersTeen() {
        // Given: Both numbers are teen numbers, 15 and 18
        int a = 15;
        int b = 18;

        // When: The loneTeen method is called
        boolean result = loneTeen.loneTeen(a, b);

        // Then: The result should be false
        assertFalse(result, "Should return false for both teen numbers (15 and 18)");
    }

    @Test
    public void testBothNumbersNotTeen() {
        // Given: Both numbers are not teen numbers, 20 and 21
        int a = 20;
        int b = 21;

        // When: The loneTeen method is called
        boolean result = loneTeen.loneTeen(a, b);

        // Then: The result should be false
        assertFalse(result, "Should return false for both not teen numbers (20 and 21)");
    }

    @Test
    public void testOneNumberIsTeenOtherIsNot() {
        // Given: One teen number 13 and one not teen number 20
        int a = 13;
        int b = 20;

        // When: The loneTeen method is called
        boolean result = loneTeen.loneTeen(a, b);

        // Then: The result should be true
        assertTrue(result, "Should return true for one teen (13) and one not teen (20)");
    }

    @Test
    public void testBothNumbersAreSameTeen() {
        // Given: Both numbers are the same teen number, 17 and 17
        int a = 17;
        int b = 17;

        // When: The loneTeen method is called
        boolean result = loneTeen.loneTeen(a, b);

        // Then: The result should be false
        assertFalse(result, "Should return false for both same teen numbers (17 and 17)");
    }


}
