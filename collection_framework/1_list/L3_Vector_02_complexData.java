import java.util.Vector;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String toString () {
        return "Name: " + name + ", Age: " + age;
    }
}


class L3_Vector_02_complexData {
    public static void main(String[] args) {
        // create a vector with initial capacity = 2
        Vector<Student> stud = new Vector<>(2);

        stud.add(new Student ("Haj", 20));
        stud.add(new Student ("Raj", 19));

        //print current size and capacity of the vector
        System.out.println ("Vector Size: " + stud.size ());
        System.out.println ("Default Vector capacity increment: " + stud.capacity ());

        stud.add(new Student ("Sar", 18));
        stud.add(new Student ("Kan", 17));

        //print current size and capacity again
        System.out.println ("Vector Size after addition: " + stud.size ());
        System.out.println ("Vector Capacity after increment: " + stud.capacity ());

        for (Student x:stud)
            System.out.println (x);
    }


/*
OUTPUT: Vector Size: 2
        Default Vector capacity increment: 2
        Vector Size after addition: 4
        Vector Capacity after increment: 4
        Name: Haj, Age: 20
        Name: Raj, Age: 19
        Name: Sar, Age: 18
        Name: Kan, Age: 17
*/
}