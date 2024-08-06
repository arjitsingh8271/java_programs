class str2_string_constant_pool {
	
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);		//-> true
		/*
		Java uses a concept called string interning. 
		When you create a string literal (e.g., String s1 = "Java";), 
		the Java compiler places the string in a common pool. 
		If the same literal is used elsewhere in the program, 
		the same reference is returned from the pool, rather than creating a new string object. 
		*/


		String s3 = new String("Java");
		System.out.println(s2==s3);		//-> false
		/*
		When you write String s3 = new String("Java");, a new String 
		object is created on the heap, even though it has the same 
		content as the string literal "Java".
		
		s2 and s3 refer to different objects in memory, hence s2 == s3 is false.
		*/

	}
}