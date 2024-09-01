class Methods_CommandLineArg {
	
	public static void main(String[] args) {
		
		for (String str : args)
			System.out.println(str);
	}
}


/*
OUTPUT:
	
	$ javac Methods_CommandLineArg.java
	$ java Methods_CommandLineArg Hello
	Hello

	$ java Methods_CommandLineArg Hello World.
	Hello
	World.
*/