import java.util.ArrayList;

class Student {
    String name;
    int age;

    //Costructor 
    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    //toString() method is overridden to give a meaningful String representaion of each object.
    public String toString () {
        return "Name: " + name + ", Age: " + age;
    }
}

class L1_ArrayList_02_complexData {
    public static void main (String args[]) {
        // ArrayList will contain a collection of Customer's objects.
        ArrayList<Student> arr = new ArrayList<>(); 
        
        //Creating Customer objects.
        Student s1 = new Student ("Jay", 21);
        Student s2 = new Student ("Shane", 19);
        Student s3 = new Student ("Ricky", 17);

        //Storing objects in an ArrayList collection class.
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for (Student s:arr)
            System.out.println (s);
    }
}


/*
OUTPUT: Name: Jay, Age: 21                                                          
        Name: Shane, Age: 19                    
        Name: Ricky, Age: 17 
*/