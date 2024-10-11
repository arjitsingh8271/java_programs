enum Status {
	Pending, Running, Failed, Success;
}

class Enum04_switchCase {
	
	public static void main(String[] args) {
		Status st = Status.Running;

		switch(st) {
			case Pending:
				System.out.println("Please Wait.");
				break;
			case Running:
				System.out.println("Running all Good.");
				break;
			case Failed:
				System.out.println("Try Again.");
				break;
			default:
				System.out.println("Complete.");
				break;
		}

	}

}