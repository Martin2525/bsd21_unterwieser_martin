package at.campus02.bsd;
/**
 * This is the main class to start the Caluclator.
 * @author Martin Unterwieser
 */


public class Main {

    public static void main(String[] args) {

        /**
        * @param number1 declares first number used in all calculations, is also number used for factorial.
        * @param number2 declares second number used in all calculations.
        */
        double number1 = 10;
        double number2 = 5;

        double addition;
        double subtraction;
        double division;
        double multiplication;
        double factorial;


        /**
         * Starts Calculator, please see link for details. {@link Calculator}.
         */
        Calculator calc = new Calculator();



        /**
         * Starts all current available calculations.
         */

        addition = calc.add(number1,number2);
        subtraction = calc.minus(number1,number2);
        division = calc.divide(number1,number2);
        multiplication = calc.multiply(number1,number2);
        factorial = calc.factorial(number1);

        /**
         * Prints all results.
         */
        System.out.println("Result of  the Addition is: " + addition);
        System.out.println("Result of the Subtraction is: " + subtraction);
        System.out.println("Result of the Division is: " + division);
        System.out.println("Result of the Multiplication is: " + multiplication);
        System.out.println("Result of the Factorial is: " + factorial);

    }

}
