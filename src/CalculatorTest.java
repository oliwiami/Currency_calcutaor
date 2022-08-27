import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void NegativeValue(){
        Calculator calculator = new Calculator();
        assertThrows(NumberFormatException.class, () ->{
           calculator.calculate(-1,12);
        });
    }
    @Test
    void ValueZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(0,12));
    }
    @Test
    void RateZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.calculate(3462.65, 0));
    }
    @Test
    void NegatveRate(){
        Calculator calculator = new Calculator();
        assertEquals(-3, calculator.calculate(3,-1));
    }
    @Test
    void ValueTenAndRateOne(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.calculate(10,1));
    }
    @Test
    void ValueTenAndRateOnePointTwelve(){
        Calculator calculator = new Calculator();
        assertEquals(11.2000, calculator.calculate(10.0,1.12));
    }
    @Test
    void ValueThirtySevenAndRateTwelvePointZeroSix(){
        Calculator calculator = new Calculator();
        assertEquals(446.2200, calculator.calculate(37,12.06));
    }
    @Test
    void ValueFourPointTwoAndRateZeroPointFifteen(){
        Calculator calculator = new Calculator();
        assertEquals(0.6300, calculator.calculate(4.2,0.15));
    }
    @Test
    void ValueOneThousandTwoHundredThirtyFourAndRateZeroPointZeroOne(){
        Calculator calculator = new Calculator();
        assertEquals(12.3400, calculator.calculate(1234, 0.01));
    }
    @Test
    void ValueTwoThousandFiveHundredSixtySevenAndRateOneHundredEightyNinePointOne(){
        Calculator calculator = new Calculator();
        assertEquals(485419.7000,calculator.calculate(2567,189.1));
    }

}