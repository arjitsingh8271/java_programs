enum Status {
	Pending, Running, Failed, Success;
}

class Enum03_ifElse {
	
	public static void main(String[] args) {
		Status st = Status.Failed;

		if(st == Status.Pending)
			System.out.println("Please Wait.");
		else if(st == Status.Running)
			System.out.println("Running all Good.");
		else if(st == Status.Failed)
			System.out.println("Try Again.");
		else
			System.out.println("Complete.");
	}

}