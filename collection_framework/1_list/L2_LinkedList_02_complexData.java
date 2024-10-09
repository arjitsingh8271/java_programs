import java.util.ArrayList;
import java.util.LinkedList;

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


class L2_LinkedList_02_complexData {
    public static void main (String[]args) {
        LinkedList<Student> list1 = new LinkedList<>();
        list1.add(new Student ("Haj", 20));
        list1.add(new Student ("Raj", 19));
        list1.add(new Student ("Sar", 18));
        list1.add(new Student ("Kan", 17));

        for (Student x:list1)
            System.out.println (x);
    }
}


/*
OUTPUT: Name: Haj, Age: 20
        Name: Raj, Age: 19
        Name: Sar, Age: 18
        Name: Kan, Age: 17
*/

/*
Difference Between ArrayList and LinkedList in Java:
----------------------------------------------------
ArrayList is slower in insertion and deletion of elements because it internally requires shifting operations, 
but faster in accessing the elements because ArrayList uses index position for every element.

LinkedList is faster in insertion and deletion of elements because it just requires modifying the links of nodes 
instead of shifting operations, but slower in accessing the elements because LinkedList does not use any index position.
*/