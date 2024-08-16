/*
Circle:
Area: A = π × r² (where r is the radius)
Perimeter (Circumference): C = 2πr

Triangle:
Area: A = ½ × b × h (where b is the base and h is the height)
Perimeter (S): S = a + b + c (where a, b, and c are the sides)

Square:
Area: A = a² (where a is the length of a side)
Perimeter: P = 4a

Rectangle:
Area: A = l × w (where l is the length and w is the width)
Perimeter: P = 2(l + w)

Parallelogram:
Area: A = b × h (where b is the base and h is the vertical height)
Perimeter: P = 2(a + b) (where a and b are the sides)

Key Differences

'Area' measures the region occupied by a shape, whereas 
'Perimeter' measures the total distance covered by the shape’s boundary.

*/


abstract class Shape {
	
	abstract double area(double r);
	abstract double perimeter(double r);
}

class Circle extends Shape {

	@Override
	double area(double r) {
		return Math.round((Math.PI * r * r) * 100.0)/100.0;
	}

	@Override
	double perimeter(double r) {
		return Math.round((2 * Math.PI * r) * 100.0)/100.0;
	}
}


class _02_AbstractClass {
	
	public static void main(String[] args) {

		Circle c = new Circle();
		System.out.println("Area :" + c.area(2.2));
		System.out.println("Perimeter :" + c.perimeter(2.2));
	}
}