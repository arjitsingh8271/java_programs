class do_while_loop01 {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("5 X " +i +" = " +i*5);
			i++;
		} while (i <= 10);
	}
}


/*
OUTPUT: 5 X 1 = 5
		5 X 2 = 10
		5 X 3 = 15
		5 X 4 = 20
		5 X 5 = 25
		5 X 6 = 30
		5 X 7 = 35
		5 X 8 = 40
		5 X 9 = 45
		5 X 10 = 50
*/