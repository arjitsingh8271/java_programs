/*
Implement a simple calculator program that performs basic 
arithmetic operations (addition, subtraction, multiplication, 
division).
*/

import java.util.Scanner;

public class asgmt_9_Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform arithmetic operation based on the operator
        switch (operator) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) 
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } 
                else 
                {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}


/*
OUTPUT: Enter first number:
		3
		Enter second number:
		4
		Enter the operation (+, -, *, /):
		*
		Result: 12.0
*/