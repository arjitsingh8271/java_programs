/*
Regular Expression 			Description
------------------			-----------
	.						Any character
	[abc]					Exactly given letters
	[abc][xy]				Either 1st or 2nd set
	[^abc]					Except abc
	[a-z1-7]				a to z  or  1 to 7
	A|B 					A or B
	XZ						Exactly XZ

	\d 						Digit
	\D 						Not Digit
	\s 						Space
	\S 						Not Space
	\w 						Alphabets or digit
	\W 						Neither aplhabets or digit

Quantifiers:

	*						0 or More time
	+						One or More
	?						0 or 1 time
	{x}						x times
	{x,y}					Between x and y times

*/


class str4_regular_expressions {
	
	public static void main(String[] args) {

		String s1 = "x";
		System.out.println(s1.matches("."));		// true
		System.out.println(s1.matches("[abc]"));	// false
		System.out.println(s1.matches("[^abc]"));	// true
		System.out.println(s1.matches("[abc][xy]"));	// false


		String s2 = "8";
		String s3 = "p";
		String s4 = "M";
		String s5 = "8Ac";
		String s6 = "vE8";

		System.out.println(s2.matches("[a-zA-Z0-9]"));		// true
		System.out.println(s3.matches("[a-zA-Z0-9]"));		// true
		System.out.println(s4.matches("[a-zA-Z0-9]"));		// true
		System.out.println(s5.matches("[a-zA-Z0-9]"));		// false
		System.out.println(s6.matches("[a-z][A-Z][0-9]"));	// true


		System.out.println(s1.matches("x|y"));	// true
		System.out.println(s1.matches("a|b"));	// false

		System.out.println(s1.matches("\\d"));	// false
		System.out.println(s2.matches("\\d"));	// true

	}
}