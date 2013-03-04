package calculatorgui;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest
{    
    @Test
    public void testPlus() {
        int val=Calculator.Calc(5,5,'+');
        assertEquals(10, val);
    }  
    @Test
    public void testMinus() {
        int val=Calculator.Calc(20,10,'-');
        assertEquals(10, val);
    }  
    @Test
    public void testMultiply() {
        int val=Calculator.Calc(2,5,'*');
        assertEquals(10, val);
    }  
    @Test
    public void testDevide() {
        int val=Calculator.Calc(20,2,'/');
        assertEquals(10, val);
    }
    @Test
    (expected=ArithmeticException.class)
    public void TestDevideByZero() {
        int val=Calculator.Calc(20, 0, '/');
    }
    @Test
    (expected=IllegalArgumentException.class)
    public void TestIllegalArgument() {
        int val=Calculator.Calc(20, 10, '%');
    }
}
