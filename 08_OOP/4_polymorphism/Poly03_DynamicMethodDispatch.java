/*
Dynamic Method Dispatch (also known as runtime polymorphism or method overriding) 
is a mechanism in Java where a method call to an overridden method is resolved at 
runtime rather than at compile time.

*/

class Animal {
	public void sound() {
		System.out.println("Having Sound");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Woof");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("Meow");
	}
}

class Poly03_DynamicMethodDispatch {
	public static void main(String[] args) {

		// We can also write Reference of Parent class and Object of Child Class
		// Because Dog, Cat Class Extends/Inherite from Animal Class.
		// We can calls only those methods that are present in Animal class

		Animal animal = new Animal();
		animal.sound();			// Having Sound

		animal = new Dog();		// Also Kowns as Upcasting
		animal.sound();			// Woof

		animal = new Cat();
		animal.sound();			// Meow


		double num1 = 12.3344;
		System.out.println(num1);	// 12.3344
		int num2 = (int) num1;		// Downcasting
		System.out.println(num2);	// 12

	}
}



/*
Explanation:
Here, animalRef is a reference of type Animal (the superclass).
However, animalRef holds an object of type Dog or Cat (the subclasses).
Even though animalRef is of type Animal, the method from the actual object type (either Dog or Cat) is called.
This is because Java uses dynamic method dispatch to decide which method to invoke at runtime.
*/