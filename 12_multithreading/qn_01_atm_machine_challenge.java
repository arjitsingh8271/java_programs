class ATM {
	synchronized void checkBalance(String name) {
		System.out.print(name + " Checking ");

		try {
			Thread.sleep(1000);
		}
		catch (Exception e){}

		System.out.println("Balance");
	}

	synchronized void withdrow(String name, int amount) {
		System.out.print(name + " Withdrowing ");

		try {
			Thread.sleep(1000);
		}
		catch (Exception e){}

		System.out.println(amount);
	}
}


class customer extends Thread {
	String name;
	int amount;
	ATM atm;

	customer(String name, int amount, ATM atm) {
		this.name = name;
		this.amount = amount;
		this.atm = atm;
	}

	void useATM() {
		atm.checkBalance(name);
		atm.withdrow(name, amount);
	}

	public void run() {
		useATM();
	}
}


class qn_01_atm_machine_challenge {
	public static void main(String[] args) {
		ATM atm = new ATM();

		customer c1 = new customer("Rahul", 1000, atm);
		customer c2 = new customer("Amit", 500, atm);

		c1.start();
		c2.start();
	}
}