/*
Create a base class Person with attributes like name and age. Create a derived class Student
that adds an attribute for student ID. Write methods to display the details of both classes.
*/

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int stud_id;

    Student(String name, int age, int stud_id) {
        super(name, age);
        this.stud_id = stud_id;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + stud_id);
    }
}

public class asgmt_07_person {
    public static void main(String[] args) {
        Person p = new Person("Arjit", 22);
        p.displayDetails();
        System.out.println();

        Student s = new Student("Rahul", 20, 121);
        s.displayDetails();
    }
}



// Without 'super' keyword

/*
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int stud_id;

    Student(String name, int age, int stud_id) {
        this.name = name;
        this.age = age;
        this.stud_id = stud_id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + stud_id);
    }
}

public class asgmt_07_person {
    public static void main(String[] args) {
        Person p = new Person("Arjit", 22);
        p.displayDetails();
        System.out.println();

        Student s = new Student("Rahul", 20, 121);
        s.displayDetails();
    }
}
*/