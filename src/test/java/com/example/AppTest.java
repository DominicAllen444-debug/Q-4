package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void calculatesFactorial() {
        assertEquals(120L, new App().factorial(5));
    }

    @Test
    void zeroFactorialIsOne() {
        assertEquals(1L, new App().factorial(0));
    }

    @Test
    void rejectsValuesOutsideSupportedRange() {
        assertThrows(IllegalArgumentException.class, () -> new App().factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> new App().factorial(21));
    }
}
