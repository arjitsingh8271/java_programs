// import java.util.Scanner;

// class qn02_reverse_a_string{

// 	public static void main (String[] args){

// 		Scanner sc = new Scanner(System.in);

// 		System.out.print("Input: ");

// 		String str, rev="";

// 		str = sc.nextLine();

// 		for(int i=str.length()-1 ; i>=0 ; i--){

// 			rev += str.charAt(i);
// 		}

// 		System.out.println("Output: " + rev);
// 	}

// }

import java.util.Scanner;

class qn02_reverse_a_string{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Input: ");

		String str;

		char[] charArr;
		char temp;

		str = sc.nextLine();

		charArr = str.toCharArray();

		int l=0, h=str.length()-1;

		while (l<h)
		{
			temp = charArr[h];
			charArr[h] = charArr[l];
			charArr[l] = temp;

			l++;
			h--;
		}

		System.out.println("Output: " + str);
	}

}