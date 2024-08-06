class str1_creating {
	
	public static void main(String[] args) {

		String s1 = "Java";
		System.out.println(s1);

		String s2 = new String("JAVA");
		System.out.println(s2);

		char c[] = {'H','e','l','l','o'};
		String s3 = new String(c);
		//String s3 = new String(c,1,3)	//-> ell
		System.out.println(s3);


		byte b[] = {65,66,67,68};
		String s4 = new String(b);
		//String s4 = new String(b,2,2)	//-> CD
		System.out.println(s4);

	}
}