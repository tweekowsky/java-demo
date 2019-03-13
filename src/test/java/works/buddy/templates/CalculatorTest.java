package works.buddy.templates;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(2, calculator.sum(1, 1));
    }

    @Test
    public void testSumZero() throws Exception {
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    public void testSumZeroOne() throws Exception {
        assertEquals(1, calculator.sum(0, 1));
    }

    @Test
    public void testSumMinus() throws Exception {
        assertEquals(-1, calculator.sum(0, -1));
    }

    @Test
    public void testSumTwoMinuses() throws Exception {
        assertEquals(-2, calculator.sum(-1, -1));
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(0, calculator.subtract(1, 1));
    }

    @Test
    public void testSubtractFromZero() throws Exception {
        assertEquals(-1, calculator.subtract(0, 1));
    }

    @Test
    public void testSubtractZero() throws Exception {
        assertEquals(1, calculator.subtract(1, 0));
    }

    @Test
    public void testSubtractZeros() throws Exception {
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testSubtractMinus() throws Exception {
        assertEquals(1, calculator.subtract(0, -1));
    }

    @Test
    public void testSubtractMinuses() throws Exception {
        assertEquals(0, calculator.subtract(-1, -1));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(1, calculator.multiply(1, 1));
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        assertEquals(0, calculator.multiply(1, 0));
    }

    @Test
    public void testMultiplyByMinus() throws Exception {
        assertEquals(-1, calculator.multiply(1, -1));
    }

    @Test
    public void testMultiplyMinuses() throws Exception {
        assertEquals(1, calculator.multiply(-1, -1));
    }
}