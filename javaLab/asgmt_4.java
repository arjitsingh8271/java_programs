/*
Create an interface "Shape" with a method calculateArea(). 
Implement this interface with classes representing different 
geometric shapes (e.g., Circle, Rectangle, Triangle). Use 
polymorphism to calculate and display the area of each shape.
*/

// Interface Shape
interface Shape
{
	double calculateArea();
}

// Class Circle implementing Shape interface
class Circle implements Shape
{
	private double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	public double calculateArea()
	{
		return Math.PI * radius * radius;
	}
}


// Class Rectangle implementing Shape interface
class Rectangle implements Shape
{
	private double width;
	private double height;

	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}

	public double calculateArea()
	{
		return width * height;
	}
}


// Class Triangle implementing Shape interface
class Triangle implements Shape
{
	private double base;
	private double height;

	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	public double calculateArea()
	{
		return 0.5 * base * height;
	}
}


// Main class
class asgmt_4
{
	public static void main (String args[])
	{
		// Creating instances of different shapes
		Shape circle = new Circle(2.5);
		Shape rectangle = new Rectangle(2, 4);
		Shape triangle = new Triangle(3, 6);

        // Calculating and displaying the area of each shape
		System.out.println("Area of Circle: " + circle.calculateArea());
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
		System.out.println("Area of Tritangle: " + triangle.calculateArea());
	}
}


/*
OUTPUT: Area of Circle: 19.634954084936208                                          
		Area of Rectangle: 8.0
		Area of Tritangle: 9.0
*/