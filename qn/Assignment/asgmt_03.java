/*
Design a class hierarchy for different types of vehicles (e.g., 
Car, Bike, Truck) with common attributes like make, model, and 
year. Implement inheritance to avoid code duplication.Include a 
superclass "Vehicle" with methods like start() and stop(). 
Override thesemethods in subclasses to provide specific 
implementations for each type of vehicle.
*/



// Superclass Vehicle
class Vehicle 
{
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() 
    {
        System.out.println("Starting the vehicle.");
    }
    public void stop() 
    {
        System.out.println("Stopping the vehicle.");
    }
}

// Subclass Car
class Car extends Vehicle 
{
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) 
    {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    
    public void start() 
    {
        System.out.println("Starting the car.");
    }    
    public void stop() 
    {
        System.out.println("Stopping the car.");
    }
}

// Subclass Bike
class Bike extends Vehicle 
{
    private boolean hasBasket;

    public Bike(String make, String model, int year, boolean hasBasket) 
    {
        super(make, model, year);
        this.hasBasket = hasBasket;
    }

    
    public void start() 
    {
        System.out.println("Starting the bike.");
    } 
    public void stop() 
    {
        System.out.println("Stopping the bike.");
    }
}

// Subclass Truck
class Truck extends Vehicle 
{
    private double loadCapacity;

    public Truck(String make, String model, int year, double loadCapacity) 
    {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    
    public void start() 
    {
        System.out.println("Starting the truck.");
    }
    public void stop() 
    {
        System.out.println("Stopping the truck.");
    }
}

public class asgmt_03 {
    
    public static void main(String[] args) 
    {
        // Creating instances of each type of vehicle
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Bike bike = new Bike("Giant", "Defy", 2020, true);
        Truck truck = new Truck("Ford", "F150", 2021, 1500.0);

        // Calling start and stop methods for each vehicle
        car.start();
        car.stop();

        bike.start();
        bike.stop();

        truck.start();
        truck.stop();
    }
}


/*
OUTPUT: Starting the car.
        Stopping the car.
        Starting the bike.
        Stopping the bike.
        Starting the truck.
        Stopping the truck.
*/