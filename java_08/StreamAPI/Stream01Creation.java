import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

class Stream01Creation {
    public static void main(String[] args) {
        
        // 1. From a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> nameStream = names.stream();
        // Stream Internal Iteration (More Efficient)
        nameStream.forEach(System.out::print);  // AliceBobCharlie
        System.out.println();

        // 2. From an Array
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.forEach(System.out::print); // JavaPythonC++
        System.out.println();

        // 3. Using Stream.of()
        Stream<Integer> numberStream = Stream.of(10, 20, 30, 40);
        numberStream.forEach(System.out::print);    // 10203040
        System.out.println();

        // 4. Generating Infinite Streams
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 2).limit(5);
        infiniteStream.forEach(System.out::print); // 13579
        System.out.println();

        // 5. Using Generate
        Stream<String> generateStream = Stream.generate(() -> "Hello").limit(5);
        generateStream.forEach(System.out::print); // HelloHelloHelloHelloHello
        System.out.println();

        // etc..

    }
}