/*
Decimal to Binary (19 = ?)
--------------------------

2 | 19		^
2 | 9 	r=1 |
2 | 4	r=1 |
2 | 2 	r=0	|
2 | 1 	r=0	|
	---------

19 = 10011


Binary to Decimal (10011 = ?)
-----------------------------

1×2^4 + 0×2^3 + 0×2^2 + 1×2^1 + 1×2^0 = 19
  ---     ---     ---     ---     --- : m

10011 = 19

*/


class QN_Conversion {
	
	public static String decimalToBinary(int n) {
		if(n == 0)
			return "0";

		String result = "";

		while(n >0) {
			int rem = n % 2;
			n = n / 2;
			result += rem;
		}

		return new StringBuilder(result).reverse().toString();
	}

	public static int binaryToDecimal(String bin) {

		int len = bin.length();
		int result = 0;
		int m = 1;

		for (int i = len-1; i >= 0; i--) {
			char lastChar = bin.charAt(i);
			Integer lastBit = Integer.valueOf(String.valueOf(lastChar));
			result = result + m * lastBit;
			m = m * 2;
		}

		return result;
	}


	public static void main(String[] args) {
		
		System.out.println(decimalToBinary(19));
		System.out.println(binaryToDecimal("10011"));
	}
}