import java.util.Arrays;
import java.util.List;

class Emp {
    public int id;
    public String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class SortingMethod {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 1, 2, 3, 3, 4, 5);
        List<Integer> removeDuplicate = (List<Integer>) num.stream().distinct().toList();
        System.out.println(removeDuplicate);    // [1, 2, 3, 4, 5]


        List<Emp> empList = Arrays.asList(new Emp(12, "Aman"), new Emp(4, "Rahul"), new Emp(2, "Rajiv"));
        System.out.println(empList);    // [12 Aman, 4 Rahul, 2 Rajiv]
        // Sorting (by id)
        List<Emp> sortId = (List<Emp>) empList.stream().sorted((e1, e2) -> e1.id - e2.id).toList();
        System.out.println(sortId);     // [2 Rajiv, 4 Rahul, 12 Aman]

        // Sorting (by name)
        List<Emp> sortName = (List<Emp>) empList.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name)).toList();
        System.out.println(sortName);   // [12 Aman, 4 Rahul, 2 Rajiv]
    }
}
