package org.example;

import org.junit.Test;

import java.util.concurrent.Callable;

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

    @Test
    public void testAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.add(-2, -3), 0.001);
    }

    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(5, 0), 0.001);
    }

    @Test
    public void testSubtractNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.subtract(-2, 3), 0.001);
    }

    @Test
    public void testSubtractZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(5,0), 0.001);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-15, calculator.multiply(-3, 5), 0.001);
    }

    @Test
    public void testMultiplyByZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(5,0), 0.001);
    }

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.divide(-6,3), 0.001);
    }

    @Test
    public void testDivideFractionalResult() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5,2), 0.001);
    }
}
