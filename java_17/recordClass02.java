record Student (int roll, String name) {
    // Default Constructor not a good practice to create it
    public Student() {
        this(0, null);
    }

    // Custom constructor
    public Student {
        if (roll < 0) {
            throw new IllegalArgumentException("Roll cannot be negative");
        }
    }

    // Adding a custom method
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}


public class recordClass02 {
    public static void main(String[] args) {
		Student s1 = new Student(21, "Raju");
		Student s2 = new Student(21, "Raju");
        Student s3 = new Student();

		System.out.println(s1);				// Student[roll=21, name=Raju]
		System.out.println(s1.equals(s2));	// true
        System.out.println(s3);             // Student[roll=0, name=null]
        s1.greet();                         // Hello, my name is Raju

	}
}
