/*
● Optional<T> class to avoid NullPointerException and write more robust, readable, and null-safe code.
● Optional is a container object which may or may not contain a non-null value.
	● If a value is present, isPresent() returns true.
	● If not, it’s empty, and calling get() will throw NoSuchElementException.

*/


import java.util.Optional;

class Optional01of {

	public static String getName() {
		//return "Rahul";
		return null;
	}

	public static Optional<String> getName1() {		
		String name = "Rahul";
		return Optional.of(name);
	}


	public static void main(String[] args) {
		
		// Old way
		String name = getName();
		if(name != null) {
			System.out.println(name.toUpperCase());
		}

		// New way
		// get()
		Optional<String> opt = getName1();
		System.out.println(opt);		// Optional[Rahul]
		System.out.println(opt.get());	// Rahul

		// isPresent()
		System.out.println(opt.isPresent());	// true

		// ifPresent()
		opt.ifPresent(x -> System.out.println(x));	// Rahul
		opt.ifPresent(System.out::println);			// Rahul

	}
}