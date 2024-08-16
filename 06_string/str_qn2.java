// Finf if a number is Binary or not
// Find is a number is Hexa-Decimal or not
// Find is a number is Date format (dd/mm/yyyy)


class str_qn2 {
	
	public static void main(String[] args) {

		int bin = 10110001;
		String s = String.valueOf(bin); 
		System.out.println(s);
		System.out.println("Is Binary: "+s.matches("[01]*"));		// true

		String s2 = "101Z";
		System.out.println("Is Hexa-Decimal: "+s2.matches("[0-9A-F]+"));	// false

		String s3 = "01/11/200";
		String s4 = "01/11/2001";
		System.out.println(s3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));	// flase
		System.out.println(s4.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));	// true

	}
}