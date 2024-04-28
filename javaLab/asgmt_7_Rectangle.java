// Write a Java program to calculate the area and perimeter of a rectangle.


import java.util.Scanner;

public class asgmt_7_Rectangle 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        // Calculate area
        double area = length * width;

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}



/*
OUTPUT: Enter the length of the rectangle:
        4
        Enter the width of the rectangle:
        3
        Area of the rectangle: 12.0
        Perimeter of the rectangle: 14.0
*/