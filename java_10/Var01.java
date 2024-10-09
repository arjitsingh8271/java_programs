/*
In Java, the var keyword is used to declare local variables with implicit typing, 
meaning that the compiler will automatically infer the type of the variable based on 
the value it is initialized with. This feature was introduced in Java 10 to improve 
code readability by reducing the need for redundant type declarations.

Key Points about var:
---------------------

	Local Variables Only: var can only be used for local variables inside methods, constructors, or blocks. 
	It cannot be used for class fields, method parameters, or return types.

	Type Inference: The compiler infers the type of the variable based on the value you assign to it. 
	Once the type is inferred, it is fixed and cannot change.

	Readable and Concise: Using var can make code cleaner and more concise, 
	especially when the type is obvious from the context.

	Initialization Required: A variable declared with var must be initialized at the point of declaration, 
	because the compiler needs to know the type.

	Not for Dynamic Typing: var doesn't make Java dynamically typed. It is still statically typed, 
	meaning the type is determined at compile time, not at runtime.


Limitations of var:
-------------------

    It cannot be used for class fields or global variables.
    It cannot be used without an initialization.
    It cannot be used with null alone because there’s no way to infer the type.
    It cannot be used with method return types or method parameters.

When to Use var:
----------------

    When the type is obvious from the initializer (e.g., var list = new ArrayList<String>();).
    When the variable’s type is long and verbose, making the code more readable with var.

When Not to Use var:
--------------------

    When it makes the code less readable by hiding the type (especially with complex or ambiguous expressions).

*/



class Abc{}

//class var{}		// error: 'var' not allowed here

class Var01 {

	//var e = 10;	// error: 'var' is not allowed here

	public static void main(String[] args) {
		
		int a = 9;
		var b = 10;

		int c;
		//var c;	// error: cannot infer type for local variable c
	
		String var = "Variable";
		var str = "Java";

		int num[] = new int[5];
		//var num1[] = new int[5];	// error: 'var' is not allowed as an element type of an array
		var num1 = new int[5];


		Abc obj = new Abc();
		var obj1 = new Abc();


	}
}