class Animal {
	public void sound() {
		System.out.println("Having Sound");
	}
}

class Dog extends Animal{
	// Method Overriding
	public void sound() {
		System.out.println("Woof");
	}
}

class Cat extends Animal{
	// Method Overriding
	public void sound() {
		System.out.println("Meow");
	}
}

class Poly02_RunTime {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.sound();

		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();


		// We can also write Reference of Parent class and Object of Child Class
		// Because Dog, Cat Class Extends/Inherite from Animal Class.
		// We can calls only those methods that are present in Animal class
		
		Animal d1 = new Dog();	// Also Kowns as Upcasting
		d1.sound();
		Animal c1 = new Cat();
		c1.sound();
		

		double num1 = 12.3344;
		int num2 = (int )num1	// Downcasting
	}
}