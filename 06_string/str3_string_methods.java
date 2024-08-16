class str3_string_methods {
	
	public static void main(String[] args) {

		String s1 = "Hello";
		System.out.println(s1.length());			// 5
		System.out.println(s1.toUpperCase());		// HELLO
		System.out.println(s1.toLowerCase());		// hello
		System.out.println(s1.substring(2));		// llo
		System.out.println(s1.substring(1,3));		// el
		System.out.println(s1.replace('H','e'));	// eello

		String s2 = "  Welcome  ";
		System.out.println(s2.trim());				// Welcome
		
		System.out.println(s1.startsWith("H"));		// true
		System.out.println(s1.endsWith("O"));		// false

		System.out.println(s1.charAt(2));			// l

		System.out.println(s1.indexOf("e"));		// 1
		System.out.println(s1.indexOf("el"));		// 1

		System.out.println(s1.lastIndexOf("l"));	// 3

		
		String s3 = "HELLO";

		System.out.println(s1.equals(s3));			// false
		System.out.println(s1.equalsIgnoreCase(s3));// true

		System.out.println(s1.compareTo(s3));		// 32
		// if (-1): s1 > s3
		// if (0): s1 == s2
		// if (1): s1 < s3

		//System.out.println(s1.valueOf(1));
		
	}
}