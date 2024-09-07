class str_qn4_reverseStr {
	
	// Using loop
	static String revStr1(String str) {
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}


	// Using StringBuilder
	static String revStr2(String str) {
		StringBuilder rev = new StringBuilder(str);
		return rev.reverse().toString();
	}


	// Using recursion
	static String revStr3(String str) {
		if(str.isEmpty())
			return str;
		return revStr3(str.substring(1)) + str.charAt(0);
	}


	// char[]
	static String revStr4(String str) {
		char[] c = str.toCharArray();
		String rev = "";
		for(int i=4; i>=0; i--) {
			rev += c[i];
		}
		return rev;
	}


	public static void main(String[] args) {
		
		String str = "Arjit";
		System.out.println(revStr1(str));
		System.out.println(revStr2(str));
		System.out.println(revStr3(str));
		System.out.println(revStr4(str));


	}
}