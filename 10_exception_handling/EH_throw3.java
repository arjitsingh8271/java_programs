// User define exception
class userAgeException extends RuntimeException {
	userAgeException(String msg) {
		super(msg);
	}
}

class EH_throw3 {
	public static void main(String[] args) {
		int age=16;
		try {
			if (age < 18)
				throw new userAgeException ("Age less than 18");
			else
				System.out.println("You can vote");
		}
		catch (userAgeException e) {
			System.out.println(e);
		}

		System.out.println("main()");
	}
}


// userAgeException: Age less than 18
// main()