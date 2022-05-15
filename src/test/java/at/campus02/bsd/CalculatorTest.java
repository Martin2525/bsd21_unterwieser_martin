package at.campus02.bsd;

class CalculatorTest {

    @Test
    void CalculatorTest(){
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.add(1,2));
        assertEquals(2,calculator.multiply(1,2));
        assertEquals(0,calculator.minus(2,2));
        assertEquals(1,calculator.divide(2,2));
        assertEquals(6,calculator.factorial(3));
    }

    void CalculatorTest2(){
        assertTrue(calculator.add(1,2) == 3);
        assertTrue(calculator.minus(2,2) == 0);
        assertTrue(calculator.mulitply(1,2) == 2);
        assertTrue(calculator.divide (2,2) == 1);
        assertTrue(calculator.factorial(3) == 6);
    }


}
