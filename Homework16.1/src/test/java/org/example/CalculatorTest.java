package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(5.0, calculator.add(2, 3), 0.001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        assertEquals(2.0, calculator.subtract(5, 3), 0.001);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        assertEquals(2.0, calculator.divide(6, 3), 0.001);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        assertEquals(15.0, calculator.multiply(3, 5), 0.001);
    }
}
