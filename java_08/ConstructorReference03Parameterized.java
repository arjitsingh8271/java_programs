import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" +age + "]";
    }
}

public class ConstructorReference03Parameterized {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Kunal", "Arti");

        List<Student> students = new ArrayList<>();

        students = names.stream()
                    .map(name -> new Student(name))
                    .toList();

        System.out.println(students);
        // [Student [name=Ravi, age=0], Student [name=Kunal, age=0], Student [name=Arti, age=0]]
    }
}