import java.util.Optional;

class Optional02ofNullable {

	public static Optional<String> getName1() {		
		String name = null;
		return Optional.ofNullable(name);
	}


	public static void main(String[] args) {

		Optional<String> opt = getName1();
		System.out.println(opt);		// Optional.empty

		System.out.println(opt.isPresent());	// false
		opt.ifPresent(System.out::println);

	}
}