// User define exception 
class userAgeException extends RuntimeException {
	userAgeException(String msg) {
		super(msg);
	}
}

class EH_throw2 {
	public static void main(String[] args) {
		int age=16;

		if (age < 18) {
			throw new userAgeException ("Age less than 18");
		}
		else
			System.out.println("You can vote");
	}
}


// Exception in thread "main" userAgeException: Age less than 18
//        at EH_throw2.main(EH_throw2.java:12)