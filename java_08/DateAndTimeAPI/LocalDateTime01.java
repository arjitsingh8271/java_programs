// LocalDateTime: Combine date and time

import java.time.LocalDateTime;

class LocalDateTime01 {
	public static void main(String[] args) {
		// now()
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		// of()
		LocalDateTime dateTime = LocalDateTime.of(2025, 3, 30, 12, 33, 3);
		System.out.println(dateTime);

		// parse()
		LocalDateTime myDateTime = LocalDateTime.parse("2023-01-20T01:48");
		System.out.println(myDateTime); 

		// etc..
	}
}