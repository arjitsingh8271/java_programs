/*
The package program file is in another Folder 
& the main program is in another folder

/home/arjit/.../java_programming/
|
|--	09_packages
|		↳Pack02.java
|--	MyPackage
	|--	Maths
		↳Calc.java


javac -cp /home/arjit/Desktop/Programming/java_programming/ Pack02.java
java -cp .:/home/arjit/Desktop/Programming/java_programming/ Pack02

*/


import MyPackages.Maths.Calc;

class Pack02 {
	
	public static void main(String[] args) {
		
		Calc arithmetic = new Calc(7, 5);
		System.out.println(arithmetic.add());
		System.out.println(arithmetic.sub());
		System.out.println(arithmetic.div());
		System.out.println(arithmetic.mul());
		System.out.println(arithmetic.rem());

	}
}


/*
OUTPUT: 12    
		2                                                                           
		1                                                                           
		35
		2
*/