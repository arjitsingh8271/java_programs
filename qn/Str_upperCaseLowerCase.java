class str_qn5_upperCaseLowerCase {
	
	// Count upperCase & lowerCase
	static void countUpperLower(String str) {
		int cU=0, cL=0;

		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				cU++;
			else
				cL++;
		}

		System.out.println("Lower Case: " +cL);
		System.out.println("Upper Case: " +cU);
	}


	// Convert into Lower Case
	static String cnvtLowerCase(String str) {
		String lc = "";
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				lc += (char) (str.charAt(i)+32);
			else
				lc += str.charAt(i);
		}
		return lc;
	} 


	// Convert into Lower Case
	static String cnvtUpperCase(String str) {
		String lc = "";
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				lc += (char) (str.charAt(i)-32);
			else
				lc += str.charAt(i);
		}
		return lc;
	}

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);					// Hello World
		
		countUpperLower(str);						// Lower Case: 9
													// Upper Case: 2
		
		System.out.println(cnvtLowerCase(str));		// hello world
		System.out.println(cnvtUpperCase(str));		// HELLO WORLD

		// inbuilt methods
		System.out.println(str.toLowerCase());		// hello world
		System.out.println(str.toUpperCase());		// HELLO WORLD

	}
}