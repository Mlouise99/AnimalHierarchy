package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTesting {

    @Test
    void testAddition() {
        CalculatorTesting calc = new CalculatorTesting();
        assertEquals(5, calc.add(2, 3));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
