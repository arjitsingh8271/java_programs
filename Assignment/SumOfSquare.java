import java.util.Scanner;

public class SumOfSquare 
{
    static void printSeries(int n, int total) 
    {
        if(n<=0)
        {
            System.out.println(" Enter a Positive Number");
            return;
        }
        
        int i = 1;
        for (i = 1; i < n; i++) 
        {
            System.out.print(i + "^2 + ");
        }
        System.out.println(i + "^2 = " + total);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of 'n': ");
        int n = scanner.nextInt();
        int sum = (n * (n + 1) * (2 * n + 1 )) / 6;
        printSeries(n,sum);
    }
}