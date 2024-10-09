/*
Records are a special kind of class designed to act as simple data carriers. 
They help to reduce boilerplate code by automatically providing commonly used methods like toString(), equals(), hashCode(), and getters.

Key Points of Record Class:
---------------------------
    Immutable Data Carriers: Records are intended to represent immutable data structures.
    Boilerplate Reduction: With records, you don't need to manually write the constructor, toString(), hashCode(), and equals() methods.
    Compact Syntax: Records provide a compact syntax for declaring classes that are primarily used to store data.
    Final Fields: Fields in a record are implicitly final, meaning once they are set in the constructor, they cannot be modified.

Syntax of Record Class:
-----------------------
	public record Person(String name, int age) {}

This single line automatically generates:
-----------------------------------------
    A constructor with the parameters name and age.
    Getters for name and age, named name() and age() respectively.
    Proper implementations of toString(), equals(), and hashCode().

Generated Methods:
------------------
    Getters: In the record Person(String name, int age), Java automatically provides name() and age() methods.
    toString(): Returns a string representation, for example, Person[name=Alice, age=30].
    hashCode(): A hash code method that considers all fields.
    equals(): A comparison method that checks whether two records have the same field values.

Limitations of Records:
-----------------------
    Mutability: Fields in a record are implicitly final, meaning you cannot modify them after the record has been created.
    Inheritance: Records cannot extend other classes (because they extend java.lang.Record implicitly). However, they can implement interfaces.
    No Setter Methods: Since the fields are final, there are no setter methods for modifying values.

Advantages of Records:
----------------------
    Concise Code: Removes the need for boilerplate code.
    Immutable by Design: Helps create immutable data structures with minimal effort.
    Better Readability: Provides a more readable way to define simple data objects.

Use Cases:
----------
    When you want to create a data carrier class that holds simple data like a DTO (Data Transfer Object) or VO (Value Object).
    Useful for objects where you need value-based equality and immutability.
*/







// class Student {
	
// 	private int roll;
// 	private String name;

// 	Student(int roll, String name) {
// 		this.roll = roll;
// 		this.name = name;
// 	}

// 	void setRoll(int roll) {
// 		this.roll = roll;
// 	}

// 	int getRoll() {return roll;}

// 	void setName(String name) {
// 		this.name = name;
// 	}

// 	String getName() {return name;}

	
// 	@Override
// 	public String toString() {
// 		return "Student [roll=" + roll + ", name=" + name + "]";
// 	}

// 	@Override
// 	public int hashCode() {
// 		final int prime = 31;
// 		int result = 1;
// 		result = prime * result + roll;
// 		result = prime * result + ((name == null) ? 0 : name.hashCode());
// 		return result;
// 	}

// 	@Override
// 	public boolean equals(Object obj) {
// 		if (this == obj)
// 			return true;
// 		if (obj == null)
// 			return false;
// 		if (getClass() != obj.getClass())
// 			return false;
// 		Student other = (Student) obj;
// 		if (roll != other.roll)
// 			return false;
// 		if (name == null) {
// 			if (other.name != null)
// 				return false;
// 		} else if (!name.equals(other.name))
// 			return false;
// 		return true;
// 	}
// }


// class recordClass01 {
	
// 	public static void main(String[] args) {
		
// 		Student s1 = new Student(21, "Raju");
// 		Student s2 = new Student(21, "Raju");
// 		System.out.println(s1.getName());	// Raju
		
// 		//System.out.println(s1);			// Student@7ad041f3
// 		// After Override toString()
// 		System.out.println(s1);				// Student [roll=21, name=Raju]

// 		//System.out.println(s1.equals(s2));	// false
// 		// After Override equals()
// 		System.out.println(s1.equals(s2));		// true
	
// 	}

// }


record Student (int roll, String name) {}

class recordClass01 {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Raju");
		Student s2 = new Student(21, "Raju");

		System.out.println(s1);					// Student[roll=21, name=Raju]
		System.out.println(s1.equals(s2));		// true

		System.out.println(s1.name());			// Raju
	}
}