package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.log4j.*;


public class Main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        double number1 = 10;
        double number2 = 5;

        double addition;
        double subtraction;
        double division;
        double multiplication;
        double factorial;

        Calculator calc = new Calculator();
        logger.info("This info message should show up");
        logger.error("This error message should show up");



        addition = calc.add(number1,number2);
        subtraction = calc.minus(number1,number2);
        division = calc.divide(number1,number2);
        multiplication = calc.multiply(number1,number2);
        factorial = calc.factorial(number1);


        System.out.println("Result of  the Addition is: " + addition);
        System.out.println("Result of the Subtraction is: " + subtraction);
        System.out.println("Result of the Division is: " + division);
        System.out.println("Result of the Multiplication is: " + multiplication);
        System.out.println("Result of the Factorial is: " + factorial);

    }

}
