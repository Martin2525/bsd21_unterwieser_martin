package at.campus02.bsd;


/**
 * This is the Calculator Class to actually calculate the program.
 * @author Martin Unterwieser
 */
public class Calculator {

    /**
        @param number1 is the first number used for caluclations.
        @param number2 ist the second number used for calulation.
        @return It returns the addition of number1 and number2.
    **/

    public double add(double number1, double number2){
        return number1+number2;
    }


    /**
     @param number1 is the first number used for caluclations.
     @param number2 ist the second number used for calulation.
     @return It returns the subtraction of number2 from number1.
     **/
    public double minus(double number1, double number2){
        return number1 - number2;
    }

    /**
     @param number1 is the first number used for caluclations.
     @param number2 ist the second number used for calulation.
     @return It returns the divison of number1 though number2.
     @throws 0 if number 2 is 0 (divison through zero not allowed)
     **/

    public double divide(double number1, double number2){

        if (number2 == 0){
            System.out.println("Divison through 0 is not allowed");
            return 0;
        }

        return number1/number2;
    }

    /**
     @param number1 is the first number used for caluclations.
     @param number2 ist the second number used for calulation.
     @return It returns the multiplications of  number1 with number2.
     **/

    public double multiply(double number1, double number2){
        return number1*number2;
    }


    /**
     @param number1 is the first number used for caluclations.
     @return It returns factorial of number1 (example 4!)
     **/

    public double factorial(double number1){
        int result = 1;
        
        for (int factor = 2; factor <= number1; factor++) {
            result *= factor;
        }
        return result;
    }



}
