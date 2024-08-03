import java.util.Scanner;

class qn01_reverse_a_number{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Input: ");

		int num, temp, rev=0, digi;

		num = sc.nextInt();
		temp = num;
		
		while(temp != 0){

			digi = temp % 10;
			rev = rev * 10 + digi;
			temp = temp / 10; 
		}

		System.out.println("Output: "+ rev);
	}
}