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