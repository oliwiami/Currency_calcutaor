import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test_ValueNegative(){
        Calculator calculator = new Calculator();
        assertThrows(NumberFormatException.class, () ->{
           calculator.calculate(-1,12);
        });
    }
    @Test
    void test_Value_Zero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(0,12));
    }
    @Test
    void test_RateZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(3462.65, 0));
    }
    @Test
    void test_RateNegative(){
        Calculator calculator = new Calculator();
        assertEquals(-3, calculator.calculate(3,-1));
    }
    @Test
    void test_Value10_Rate1(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.calculate(10,1));
    }
    @Test
    void test_Value10_Rate1point12(){
        Calculator calculator = new Calculator();
        assertEquals(11.2000, calculator.calculate(10,1.12));
    }
    @Test
    void test_Value37_Rate12point06(){
        Calculator calculator = new Calculator();
        assertEquals(446.2200, calculator.calculate(37,12.06));
    }
    @Test
    void test_Value4point2_Rate0point15(){
        Calculator calculator = new Calculator();
        assertEquals(0.6300, calculator.calculate(4.2,0.15));
    }
    @Test
    void test_Value1234_Rate0point01(){
        Calculator calculator = new Calculator();
        assertEquals(12.3400, calculator.calculate(1234, 0.01));
    }
    @Test
    void test_Value2567_Rate189point1(){
        Calculator calculator = new Calculator();
        assertEquals(485419.7000,calculator.calculate(2567,189.1));
    }
    @Test
    void test_Value39606point10_Rate0point1423(){
        Calculator calculator = new Calculator();
        assertEquals(5635.9480,calculator.calculate(39606.10,0.1423));
    }
    @Test
    void test_Value1000000_Rate1point0047(){
        Calculator calculator = new Calculator();
        assertEquals(1004700.0000, calculator.calculate(1000000,1.0047));
    }
    @Test
    void test_Value200000_Rate193point025(){
        Calculator calculator = new Calculator();
        assertEquals(38605000.0000,calculator.calculate(200000,193.025));
    }
    @Test
    void Value0point52_Rate0point49(){
        Calculator calculator = new Calculator();
        assertEquals(0.2548,calculator.calculate(0.52,0.49));
    }
}