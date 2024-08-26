package org.junit;
//import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1, calculator.divide(3, 3));
        Assertions.assertEquals(0, calculator.divide(3, 0));
        Assertions.fail();
    }
}
