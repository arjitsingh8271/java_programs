import java.util.Optional;

public class Optional03Methods {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Rahul");

        // 1. isPresent()
        if (name.isPresent()) {
            System.out.println("Value: " + name.get());
        }

        // 2. ifPresent()
        name.ifPresent(System.out::println);

        // 3. orElse()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.orElse("Default Name"));   // prints "Default Name"
        System.out.println(name.orElse("Default Name"));    // Rahul


        // 4. orElseGet()
        System.out.println(empty.orElseGet(() -> "Generated Name"));    // Generated Name
        System.out.println(name.orElseGet(() -> "Generated Name"));     // Rahul


        // 5. orElseThrow()
        // empty.orElseThrow(() -> new RuntimeException("Value not found"));


        // 6. map()
        Optional<String> upper = name.map(String::toUpperCase);
        upper.ifPresent(System.out::println); // RAHUL

        // 7. filter()
        Optional<String> filtered = name.filter(s -> s.startsWith("R"));
        System.out.println(filtered.isPresent()); // true
    }
}
