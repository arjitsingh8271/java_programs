import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;

class Stream03TerminalOperations {
	public static void main(String[] args) {

		List<Integer> num = List.of(22, 3, 43, 5, 1, 5);
		List<String> str = List.of("java", "python", "c++");


		// collect(Collectors.toList())		Collects stream elements into a list.
		List<String> upperNames = str.stream()
                               .map(String::toUpperCase)
                               .collect(Collectors.toList());
        System.out.println(upperNames);		// [JAVA, PYTHON, C++]


        // forEach(Consumer<T>)		Performs an action for each element.
		str.stream().forEach(System.out::println);	// java
													// python
													// c++
		num.stream().forEach( e -> System.out.print(e +" "));	// 22 3 43 5 1 5 6


		// count()	Counts elements in the stream.
		long count = num.stream().count();
		System.out.println(count); 		// 6


		//  min() and max()		Finds the minimum and maximum values.
		int min1 = num.stream().min(Integer::compareTo).get();
        int max1 = num.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(min1); // 1
        System.out.println(max1); // 43

        int min2 = num.stream().min((a, b) -> a - b).get();
        int max2 = num.stream().max((a, b) -> a - b).get();
        System.out.println(min2); // 1
        System.out.println(max2); // 43

        Optional<Integer> min3 = num.stream().min(Integer::compareTo);
        Optional<Integer> max3 = num.stream().max(Integer::compareTo);
        System.out.println(min3.get()); // 1
        System.out.println(max3.get()); // 43


		// anyMatch(), allMatch(), noneMatch()		Checks conditions on elements.

		boolean anyMatch = num.stream().anyMatch(n -> n > 25);
		boolean allMatch = num.stream().allMatch(n -> n > 5);
		boolean noneMatch = num.stream().noneMatch(n -> n > 50);

		System.out.println(anyMatch);  // true
		System.out.println(allMatch);  // false
		System.out.println(noneMatch); // true
	}
}