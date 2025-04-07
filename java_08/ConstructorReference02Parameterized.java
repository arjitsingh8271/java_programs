import java.util.function.Function;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ConstructorReference02Parameterized {
    public static void main(String[] args) {
        Function<String, Student> func = Student::new;
        Student s = func.apply("Rahul");
        System.out.println(s.name);
    }
}
