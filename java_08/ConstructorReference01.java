import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student object created!");
    }
}

public class ConstructorReference01 {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;
        Student s = supplier.get();
    }
}
