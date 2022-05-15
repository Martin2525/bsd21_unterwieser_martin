package at.campus02.bsd;

public class Main {

    public static void main(String[] args) {
        double number1 = 10;
        double number2 = 5;

        double addition;
        double subtraction;
        double division;
        double multiplication;
        double factorial;

        Calculator calc = new Calculator();



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
