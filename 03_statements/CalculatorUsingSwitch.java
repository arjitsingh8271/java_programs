import java.util.Scanner;

class CalculatorUsingSwitch {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input two number: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Input Operation '+, -, /, *': ");
		char opt = sc.next().charAt(0);



		switch (opt) {
			case '+':
				System.out.printf("Result: %d\n", n1+n2);
				break;

			case '-':
				System.out.printf("Result: %d\n", n1-n2);
				break;
		
			case '/':
				System.out.printf("Result: %d\n", n1/n2);
				break;
		
			case '*':
				System.out.printf("Result: %d\n", n1*n2);
				break;

			default:
            	// operator is doesn't match any case 	constant (+, -, /, *)
            	System.out.println("Error! The operator is not correct");
            	break;
		}
	}
}