package myPack;

public class PackBasicCalculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not-a-Number
        }
    }
}

// to compile: javac -d . PackBasicCalculator.java