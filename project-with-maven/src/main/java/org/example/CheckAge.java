package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAge {
    public boolean checkAge(int age) {
        return age >= 18;
    }
    @Test
    public void testCheckAge() {
        CheckAge checkAge = new CheckAge();
        assertTrue(checkAge.checkAge(20), "Age should be 18 or older");
        assertFalse(checkAge.checkAge(16), "Age should be 18 or older");
    }
}
