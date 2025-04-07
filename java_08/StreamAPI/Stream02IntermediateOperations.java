import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


class Stream02IntermediateOperations {
	public static void main(String[] args) {
		
		List<Integer> num = List.of(22, 3, 43, 5, 1, 5);
		List<String> str = List.of("java", "python", "c", "c++");


		// filter(Predicate<T>)				Filters elements based on a condition.
		List<Integer> filtered = num.stream()
                                	.filter(n -> n > 20)
                                	.collect(Collectors.toList());	// (Terminal Operations)
        System.out.println(filtered);	// [43, 22]

        List<String> filter = (List<String>) str.stream().filter(e -> e.startsWith("c")).toList();
        System.out.println(filter);     // [c, c++]


        // map(Function<T, R>)		Transforms elements.
        List<Integer> square = num.stream()
        					   	  .map(n -> n*n)
        					   	  .collect(Collectors.toList());
        System.out.println(square);		// [484, 9, 1849, 25, 1, 25]

        List<String> upperNames = str.stream()
        							 .map(String::toUpperCase)
        							 .collect(Collectors.toList());
        System.out.println(upperNames);		// [JAVA, PYTHON, C, C++]


        // distinct()	Removes duplicate elements.
        List<Integer> uniqueNumbers = num.stream()
                                    	 .distinct()
                                    	 .collect(Collectors.toList());
		System.out.println(uniqueNumbers); 	// [22, 3, 43, 5, 1]


		// sorted()		Sorts elements.
		List<Integer> asceOrder = num.stream()
                                     .sorted()
                                     .collect(Collectors.toList());
		System.out.println(asceOrder); // Output: [1, 3, 5, 5, 22, 43]

		List<Integer> desceOrder = num.stream()
                                     .sorted((a,b) -> b - a)	// Custome sort using Comparator
                                     .collect(Collectors.toList());
		System.out.println(desceOrder); // Output: [43, 22, 5, 5, 3, 1]


		// limit(n)		Limits the number of elements in a stream.
		List<Integer> limited = num.stream()
                               .limit(3)
                               .collect(Collectors.toList());
		System.out.println(limited); 		// [22, 3, 43]


		// skip(n)	Skips the first n elements.
		List<Integer> skipped = num.stream()
                               .skip(2)
                               .collect(Collectors.toList());
		System.out.println(skipped); 		// [43, 5, 1, 5]

	}
}