/*
The package program file & the main program is in same folder

/home/arjit/.../java_programming/
|
|--	09_packages
	|--mypac2
	|	↳MultiplicationTable.java
	↳Pack02.java

 
javac Pack01.java
java pac01
*/


import mypac2.MultiplicationTable;

class Pack01 {
	
	public static void main(String[] args) {
		
		MultiplicationTable tab5 = new MultiplicationTable(5, 6);
		tab5.printTable();

		System.out.println();

		System.out.println(tab5.getNum());
		System.out.println(tab5.getUpto());

	}
}


/*
OUTPUT: 5 x 1 = 5
		5 x 2 = 10
		5 x 3 = 15
		5 x 4 = 20
		5 x 5 = 25
		5 x 6 = 30

		5
		6
*/