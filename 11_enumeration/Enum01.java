/*


*/


enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}



class Enum01 {
	public static void main(String[] args) {
		
		Day mon = Day.MONDAY;
		System.out.println(mon);
		System.out.println(mon.ordinal());
		
		System.out.println(mon.getClass().getSuperclass());

		Day fri = Day.FRIDAY;
		System.out.println(fri);
		System.out.println(fri.ordinal());


		Day[] day = Day.values();
		for (Day s : day) {
			System.out.println(s.ordinal() +" " +s);
		}
	}
}


/*
OUTPUT: MONDAY
		1

		class java.lang.Enum
		
		FRIDAY
		5

		0 SUNDAY
		1 MONDAY
		2 TUESDAY
		3 WEDNESDAY
		4 THURSDAY
		5 FRIDAY
		6 SATURDAY
*/