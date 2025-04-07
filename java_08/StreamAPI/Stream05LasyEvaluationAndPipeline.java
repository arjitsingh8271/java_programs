/*
Lazy Evaluation:
Intermediate operations (e.g., filter(), map()) are lazy and don’t 
execute until a terminal operation (e.g., collect(), forEach()) is called.

Stream Processing Pipeline: Chain of multiple operation
eg:	list.stream().filter(n -> n%2==0).map(n -> n*n).forEach(System.out::println);

*/

import java.util.List;
import java.util.stream.Stream;

class Stream05LasyEvaluationAndPipeline {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);

		// Creating Stream
		list.stream()
			// Filter even element.
			.filter(n -> {System.out.println("Filtering: " +n); return n%2==0;})	// .filter(n -> n%2==0)
			// Square of each element			
			.map(n -> n*n)			// This won't run until a terminal operation is called
			// Print each element				
			.forEach(System.out::println);	
	}
}