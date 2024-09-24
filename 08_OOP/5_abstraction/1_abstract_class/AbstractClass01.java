/*
Key Points to Remember for Abstract
------------------------------------

We use the abstract keyword to create abstract classes and methods.

An abstract method doesn't have any implementation (method body).

A class containing abstract methods should also be abstract.

We cannot create objects of an abstract class 
but we can creare a reference of an abstract class.
For example : abstracrClass ac = new subClass();

To implement features of an abstract class, we inherit subclasses from it and 
create objects of the subclass.

A subclass must override all abstract methods of an abstract class. However, 
if the subclass is declared abstract, it's not mandatory to override abstract methods.

We can access the static attributes and methods of an abstract class using the 
reference of the abstract class. For example, className.staticMethod();
*/




// Abstract class
abstract class Shape {
	
	// Abstract method (no implementation)
	abstract void draw();

	// Non-abstract method
	void display() {
		System.out.println("This is Shape.");
	}
}


class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing a Circle.");
	}
}

class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle.");
	}
}

class Triangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing a Triangle.");
	}
}


class AbstractClass01 {
	
	public static void main(String[] args) {

		// Creating objects of Circle, Rectangle and Triangle
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();


		// Calling methods on the objects
        c.display();
        c.draw();

        r.display();
        r.draw();

        t.display();
        t.draw();
	}
}


/*
OUTPUT: This is Shape.
		Drawing a Circle.
		This is Shape.
		Drawing a Rectangle.
		This is Shape.
		Drawing a Triangle.
*/