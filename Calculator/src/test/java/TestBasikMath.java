import org.junit.Test;

import static org.junit.Assert.*;


public class TestBasikMath {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        String input = "12+1";
        int result = calc.value(input);
        assertEquals(13, result);
    }

    @Test
    public void testDiff(){
        Calculator calc = new Calculator();
        String input = "25-5";
        int result = calc.value(input);
        assertEquals(20, result);
    }
    @Test
    public void testMul(){
        Calculator calc = new Calculator();
        String input = "2*7";
        int result = calc.value(input);
        assertEquals(14, result);
    }
    @Test
    public void testDiv(){
        Calculator calc = new Calculator();
        String input = "6/6";
        int result = calc.value(input);
        assertEquals(1, result);
    }
}