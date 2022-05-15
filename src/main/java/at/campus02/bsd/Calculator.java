package at.campus02.bsd;

public class Calculator {


    public double add(double number1, double number2){
        return number1+number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2){

        if (number2 == 0){
            System.out.println("Divison through 0 is not allowed");
            return 0;
        }

        return number1/number2;
    }

    public double multiply(double number1, double number2){
        return number1*number2;
    }

    public double factorial(double number1){
        int result = 1;
        
        for (int factor = 2; factor <= number1; factor++) {
            result *= factor;
        }
        return result;
    }



}
