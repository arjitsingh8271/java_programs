abstract class Animal {
	
	public abstract void sound();
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

class AbstractClass03 {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
	}
}