package myPack;

public class PackAdvancedCalculator {
    public double calculateSquare(double num) {
        return num * num;
    }

    public double calculateSquareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number!");
            return Double.NaN; // Not-a-Number
        }
    }
}

// to compile: javac -d . PackAdvancedCalculator.java