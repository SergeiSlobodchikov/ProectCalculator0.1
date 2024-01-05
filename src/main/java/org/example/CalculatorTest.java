package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    public void testPlus() {
        Calculator calculator = new Calculator();
        double result = calculator.plus(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        double result = calculator.minus(5, 3);
        assertEquals(2, result);
    }
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiplication(5, 3);
        assertEquals(15, result);
    }
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.division(6, 3);
        assertEquals(2, result);
    }
}