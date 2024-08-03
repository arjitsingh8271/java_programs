/*
Write a Java program which will contain the user-defined package Calculator with all 4 basic
arithmetic operations in a class and another class in package will contain operations like
Square and Square Root (use Math.sqrt()) method.
*/


import myPack.PackBasicCalculator;
import myPack.PackAdvancedCalculator;

class asgmt_08_package 
{
    public static void main(String[] args) 
    {
        PackBasicCalculator basicCalc = new PackBasicCalculator();
        System.out.println("Addition: " + basicCalc.add(10, 5));
        System.out.println("Subtraction: " + basicCalc.subtract(10, 5));
        System.out.println("Multiplication: " + basicCalc.multiply(10, 5));
        System.out.println("Division: " + basicCalc.divide(10, 5));

        PackAdvancedCalculator advCalc = new PackAdvancedCalculator();
        System.out.println("Square of 9: " + advCalc.calculateSquare(9));
        System.out.println("Square root of 25: " + advCalc.calculateSquareRoot(25));
    }
}



/*
OUTPUT: Addition: 15.0
        Subtraction: 5.0
        Multiplication: 50.0
        Division: 2.0
        Square of 9: 81.0
        Square root of 25: 5.0
*/
