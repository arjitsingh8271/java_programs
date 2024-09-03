/*

0 1 1 2 3 5 8

*/



class Recursion_03_fibonacci {
	
	static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}