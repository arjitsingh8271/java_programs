import java.util.List;

class MethodReferences01 {
	public static void main(String[] args) {
		
		List<String> list = List.of("Alice", "Bob", "Charlie");
		list.forEach(x -> System.out.println(x));	// Alice
													// Bob
													// Charlie

		// Method Reference
		list.forEach(MethodReferences01::print);	// Alice
													// Bob
													// Charlie
	}

	public static void print(String s) {
		System.out.println(s);
	}
}