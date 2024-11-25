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

class L1_ArrayList_03_complexData {
    public static void main (String args[]) {
        // ArrayList will contain a collection of Customer's objects.
        ArrayList<Student> arr = new ArrayList<>(); 
        
        //Creating Customer objects.
        Student s1 = new Student ("Jay", 21);
        Student s2 = new Student ("Shane", 17);
        Student s3 = new Student ("Ricky", 19);

        //Storing objects in an ArrayList collection class.
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for (Student s:arr)
            System.out.println (s);


        // or

        ArrayList<Student> arr2 = new ArrayList<>();
        arr2.add(new Student("Rahul", 22));
        arr2.add(new Student("Amit", 18));

        for (Student s:arr2)
            System.out.println (s);


        // sorting by age descending order
        arr.sort((a, b) -> {
            if (b.age - a.age > 0)
                return 1;
            else if (b.age - a.age < 0)
                return -1;
            else
                return 0;
        });

        System.out.println(arr);    
        // [Name: Jay, Age: 21, Name: Ricky, Age: 19, Name: Shane, Age: 17]
    }
}


/*
OUTPUT: Name: Jay, Age: 21                                                          
        Name: Shane, Age: 17                    
        Name: Ricky, Age: 19

        Name: Rahul, Age: 22
        Name: Amit, Age: 18

        [Name: Jay, Age: 21, Name: Ricky, Age: 19, Name: Shane, Age: 17]
*/