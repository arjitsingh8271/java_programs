class Str_InbuiltMethods {
	
	public static void main(String[] args) {
		
		// 1. length()
		// Returns the number of characters in the string.
		String str1 = "Hello";
		System.out.println(str1.length()); 	// Output: 5


		// 2. charAt(int index)
		// Returns the character at the specified index.
		String str2 = "Hello";
		System.out.println(str2.charAt(1)); // Output: e


		// 3. substring(int beginIndex)
		// Returns a substring starting from the specified index.
		String str3 = "Hello World";
		System.out.println(str3.substring(6));		// Output: World


		// 4. substring(int beginIndex, int endIndex)
		// Returns a substring from beginIndex (inclusive) to endIndex (exclusive).
		String str4 = "Hello World";
		System.out.println(str4.substring(0, 5)); 	// Output: Hello


		// 5. contains(CharSequence s)
		// Checks if the string contains the specified sequence of characters.
		String str5 = "Hello World";
		System.out.println(str5.contains("World")); // Output: true


		// 6. equals(Object anotherString)
		// Compares two strings for equality.
		String str6 = "Hello";
		String str6_1 = "Hello";
		System.out.println(str6.equals(str6_1)); 	// Output: true


		// 7. equalsIgnoreCase(String anotherString)
		// Compares two strings, ignoring case considerations.
		String str7 = "Hello";
		String str7_1 = "hello";
		System.out.println(str7.equalsIgnoreCase(str7_1)); // Output: true


		// 8. toLowerCase()
		// Converts all characters of the string to lowercase.
		String str8 = "HELLO";
		System.out.println(str8.toLowerCase()); // Output: hello


		// 9. toUpperCase()
		// Converts all characters of the string to uppercase.
		String str9 = "hello";
		System.out.println(str9.toUpperCase()); // Output: HELLO


		// 10. trim()
		// Removes leading and trailing whitespace from the string.
		String str10 = "  Hello World  ";
		System.out.println(str10.trim()); // Output: "Hello World"


		// 11. replace(char oldChar, char newChar)
		// Replaces all occurrences of a specified character with a new character.
		String str11 = "Hello";
		System.out.println(str11.replace('l', 'p')); // Output: Heppo


		// 12. replace(CharSequence target, CharSequence replacement)
		// Replaces all occurrences of a target sequence with a replacement sequence.
		String str12 = "Hello World";
		System.out.println(str12.replace("World", "Java")); // Output: Hello Java


		// 13. split(String regex)
		// Splits the string around matches of the given regular expression.
		String str13 = "apple,orange,banana";
		String[] fruits = str13.split(",");
		for(String fruit : fruits) {
    		System.out.println(fruit);
		}
		// Output:
		// apple
		// orange
		// banana


		// 14. indexOf(char ch)
		// Returns the index of the first occurrence of the specified character.
		String str14 = "Hello";
		System.out.println(str14.indexOf('l')); // Output: 2


		// 15. lastIndexOf(char ch)
		// Returns the index of the last occurrence of the specified character.
		String str = "Hello";
		System.out.println(str.lastIndexOf('l')); // Output: 3


		// 16. startsWith(String prefix)
		// Checks if the string starts with the specified prefix.
		String str16 = "Hello World";
		System.out.println(str16.startsWith("Hello")); // Output: true


		// 17. endsWith(String suffix)
		// Checks if the string ends with the specified suffix.
		String str17 = "Hello World";
		System.out.println(str17.endsWith("World")); // Output: true


		// 18. isEmpty()
		// Checks if the string is empty.
		String str18 = "";
		System.out.println(str18.isEmpty()); // Output: true


		// 19. compareTo(String anotherString)
		// Compares two strings lexicographically.
		String str19 = "Hello";
		String str19_1 = "World";
		System.out.println(str19.compareTo(str19_1)); // Output: a negative intege


		// 20. format(String format, Object... args)
		// Returns a formatted string using the specified format and arguments.
		String formattedStr = String.format("My age is %d", 25);
		System.out.println(formattedStr); // Output: My age is 25


		// 21. valueOf(Object obj)
		// Returns the string representation of the passed object.
		int num = 123;
		String str21 = String.valueOf(num);
		System.out.println(str21); // Output: 123


		// 22. join(CharSequence delimiter, CharSequence... elements)
		// Joins multiple strings with a given delimiter.
		String result = String.join("-", "apple", "orange", "banana");
		System.out.println(result); // Output: apple-orange-banana


		// 23. matches(String regex)
		// Tests whether the string matches the given regular expression.
		String str23 = "Hello123";
		System.out.println(str23.matches("[a-zA-Z]+[0-9]+")); // Output: true


		// 24. getBytes()
		// Encodes the string into a sequence of bytes using the platform's default charset.
		String str24 = "Hello";
		byte[] bytes = str24.getBytes();
		for(byte b : bytes) {
    		System.out.print(b + " ");
		}
		// Output: 72 101 108 108 111
		System.out.println();


		// 25. toCharArray()
		// Converts the string into a character array.
		String str25 = "Hello";
		char[] charArray = str25.toCharArray();
		for (char c : charArray) {
    		System.out.print(c + " ");
		}
		// Output: H e l l o
		System.out.println();
	}
}