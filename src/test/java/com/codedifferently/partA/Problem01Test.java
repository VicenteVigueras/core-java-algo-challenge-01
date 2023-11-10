package com.codedifferently.partA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem01Test {
    // Instance of the class that contains the sleepIn method
    private Problem01 sleepInInstance = new Problem01();

    @Test
    public void whenItIsNotWeekdayAndNotVacation_thenCanSleepIn() {
        // Given: It is not a weekday and not vacation
        boolean weekday = false;
        boolean vacation = false;

        // When: sleepIn method is called
        boolean result = sleepInInstance.sleepIn(weekday, vacation);

        // Then: The result should be true
        assertTrue(result, "Should be able to sleep in when it's not a weekday and not vacation");
    }

    @Test
    public void whenItIsWeekdayAndNotVacation_thenCannotSleepIn() {
        // Given: It is a weekday and not vacation
        boolean weekday = true;
        boolean vacation = false;

        // When: sleepIn method is called
        boolean result = sleepInInstance.sleepIn(weekday, vacation);

        // Then: The result should be false
        assertFalse(result, "Should not be able to sleep in on a weekday when not on vacation");
    }

    @Test
    public void whenItIsWeekdayAndVacation_thenCanSleepIn() {
        // Given: It is a weekday and vacation
        boolean weekday = true;
        boolean vacation = true;

        // When: sleepIn method is called
        boolean result = sleepInInstance.sleepIn(weekday, vacation);

        // Then: The result should be true
        assertTrue(result, "Should be able to sleep in when it's a weekday but on vacation");
    }

    @Test
    public void whenItIsNotWeekdayAndVacation_thenCanSleepIn() {
        // Given: It is not a weekday and vacation
        boolean weekday = false;
        boolean vacation = true;

        // When: sleepIn method is called
        boolean result = sleepInInstance.sleepIn(weekday, vacation);

        // Then: The result should be true
        assertTrue(result, "Should be able to sleep in when it's not a weekday and on vacation");
    }
}
