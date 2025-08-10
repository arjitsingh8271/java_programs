//  Instance Method Reference (Arbitrary Object of a Class)

import java.util.List;

class MethodRef02Instance {
	public static void main(String[] args) {
		
		List<String> name = List.of("Alice", "Bob", "Charlie");
		
		List<String> uName = name.stream()
							//.map(names -> names.toUpperCase())
							.map(String::toUpperCase)		// Method Reference
							.toList();

		System.out.println(uName);		// [ALICE, BOB, CHARLIE]

		// Method Reference
		uName.forEach(System.out::println);
			// ALICE
			// BOB
			// CHARLIE
	}
}