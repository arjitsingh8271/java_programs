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