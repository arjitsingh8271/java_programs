/*
Here, fields (variables) and methods represent the state and 
behavior of the object respectively.

1. fields are used to store data
2. methods are used to perform some operations
*/

// -------------------------------------------------------

class CAR {
	
	// Properties / Fields
	String model;
	String brand;
	String colour;
	int speed;

	// Behaviour / Methods
	void Accelerate() {
		speed +=5;
		System.out.println(speed);
	}

	void Brake() {
		speed -=10;
		System.out.println(speed);
	}
}

class Class01
{
	public static void main (String[] args)
	{
		CAR car = new CAR();			// car is a object of 'CAR' class
					
		car.model = "Punch";
		car.brand = "TATA";
		car.colour = "Black";
		car.speed = 60;

		car.Accelerate();		// 65
		car.Brake();			// 55
	}
}

