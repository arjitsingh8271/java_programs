// Remove Special characters from a string
// Remove extra space form String
// Find number of words in a String

class str_qn3 {
	
	public static void main(String[] args) {

		String s1 = "A!b@c#1%2$3";
		String s2 = "Man Will Be Man";
		String s3 = "   abc   def ghi   jkl   ";

		
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));	// Abc123
		System.out.println(s2.replaceAll("[^a-zA-Z]", ""));		// ManWillBeMan
		System.out.println(s3.replaceAll("\\s+", " "));			// " abc def ghi jkl "
		System.out.println(s3.replaceAll("\\s+", " ").trim());	// abc def ghi jkl


		String w[] = s2.split("\\s");

		System.out.println(w.length);	// 4

	}
}