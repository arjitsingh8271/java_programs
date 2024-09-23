class println_print_printf {
	public static void main(String[] args) {
		
		String name = "Rahul";
		int age = 19;
		char sex = 'M';

		// Println (use concatination)
		System.out.println("Name: " +name +", Age: " +age +", Sex: " +sex);
		
		// Print (use concatination without new line)
		System.out.print("Name: " +name);
		System.out.println(); // for new line

		// Printf (format, like C language)
		System.out.printf("Name: %s, Age: %d, Sex: %c \n", name, age, sex);
	}
}


/*
OUTPUT: Name: Rahul, Age: 19, Sex: M
		Name: Rahul
		Name: Rahul, Age: 19, Sex: M
*/


/*
Conversion Specification:
------------------------

%d 		: a decimal integer
%h 		: a short integer
%u 		: an unsigned decimal integer
%o 		: a hexadecimal integer
%i 		: a decimal, octal or hexadecimal integer

%f 		: a floating point no.
%.2f	: floats for two digit after dot
%e 		: a floating point no.
%g 		: a floating point no.
%lf 	: long range of floating point no. (for double data type)

%c 		: singhle charater

%s 		: a string
*/