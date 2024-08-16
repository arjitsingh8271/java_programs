/*
Both StringBuilder and StringBuffer are classes in Java used to 
create mutable (modifiable) sequences of characters. 
They provide similar functionality, but they have different 
performance characteristics and thread safety features.

Key Differences:
----------------

Thread Safety:-
1. StringBuffer is synchronized, meaning it is thread-safe. 
Multiple threads can safely use StringBuffer without running 
into concurrency issues.
2. StringBuilder is not synchronized, making it faster but not 
thread-safe. It should be used in a single-threaded context 
or when external synchronization is provided.


Performance:-
Due to its lack of synchronization, StringBuilder is generally 
faster than StringBuffer.
*/

import java.util.Scanner;

class str5_StringBuilder_class {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuilder sb1 = new StringBuilder();
		
		StringBuilder sb2 = new StringBuilder("Hello");

		//String s1 = sc.nextLine();
		//StringBuilder sb3 = new StringBuilder(s1);
		StringBuilder sb3 = new StringBuilder(sc.nextLine());
		
		System.out.println(sb1);
		System.out.println("sb1 Capacity: "+sb1.capacity());
		System.out.println("sb1 Length: "+sb1.length());

		System.out.println(sb2);
		System.out.println("sb2 Capacity: "+sb2.capacity());
		System.out.println("sb2 Length: "+sb2.length());

		System.out.println(sb3);
		System.out.println("sb3 Capacity: "+sb3.capacity());
		System.out.println("sb3 Length: "+sb3.length());

	}
}


/*
The “extra” 16 positions allow for reasonable modification of the StringBuilder object
after creation without allocating any new memory locations.
*/