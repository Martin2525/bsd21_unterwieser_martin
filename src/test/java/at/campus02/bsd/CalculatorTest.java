package at.campus02.bsd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {


@Test
void calculatorTest1(){
    Calculator calculator = new Calculator();
    Assertions.assertEquals(3,calculator.add(1,2));
    Assertions.assertEquals(2,calculator.multiply(1,2));
    Assertions.assertEquals(0,calculator.minus(2,2));
    Assertions.assertEquals(1,calculator.divide(2,2));
    Assertions.assertEquals(6,calculator.factorial(3));
}


    void calculatorTest2(){
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.add(1,2) == 3);
        Assertions.assertTrue(calculator.minus(2,2) == 0);
        Assertions.assertTrue(calculator.multiply(1,2) == 2);
        Assertions.assertTrue(calculator.divide (2,2) == 1);
        Assertions.assertTrue(calculator.factorial(3) == 6);
    }


}
