/*
An interface is a fully abstract class. It includes a group 
of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java


Implementing Multiple Interfaces
--------------------------------
interface A {
  // members of A
}

interface B {
  // members of B
}

class C implements A, B {
  // abstract members of A
  // abstract members of B
}


Extending an Interface
----------------------
interface Line {
  // members of Line interface
}

// extending interface
interface Polygon extends Line {
  // members of Polygon interface
  // members of Line interface
}


Extending Multiple Interfaces
-----------------------------
interface A {
   ...
}
interface B {
   ... 
}

interface C extends A, B {
   ...
}
*/

interface Language {
	
	void getName(String name);
}

class programmingLanguage implements Language {
	
	public void getName(String name) {
		System.out.println("Programming Language : " +name);
	}
}

class _01_Interface {
	
	public static void main(String[] args) {
		programmingLanguage pl = new programmingLanguage();
		pl.getName("JAVA");
	}
}