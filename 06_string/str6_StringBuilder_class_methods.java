class str6_StringBuilder_class_methods {
	
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb); // Hello World

		sb.insert(5, ",");
		System.out.println(sb); // Hello, World

		sb.delete(5, 6);
		System.out.println(sb); // Hello World

		sb.replace(6, 11, "Java");
		System.out.println(sb); // Hello Java

		sb.reverse();
		System.out.println(sb); // avaJ olleH

		String result = sb.toString();
		System.out.println(result); // avaJ olleH

		char ch = sb.charAt(0);
		System.out.println(ch); // a

		sb.setCharAt(0, 'A');
		System.out.println(sb); // AvaJ olleH

		String sub = sb.substring(4, 8);
		System.out.println(sub); // J ol

	}
}