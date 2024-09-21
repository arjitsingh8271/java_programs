class BankAccount {
	private String name;
	private long accountNumber;
	private double balance;

	BankAccount (String name, long accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void acountDetails() {
		System.out.println("Account Holder: " +name);
		System.out.println("Account Number: " +accountNumber);
		System.out.println("Balance: " +balance);
	}

	double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } 
        else {
            System.out.println("Invalid deposit amount.");
        }
    }	

	void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } 
        else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

class Encaps02 {
	
	public static void main(String[] args) {
		BankAccount p1 = new BankAccount("Amit Singh", 123456789, 3000);
		p1.acountDetails();

		p1.deposit(2000);
		
		System.out.println("Current Balance: " +p1.getBalance());
		p1.withdraw(1000);
		
		System.out.println("Current Balance: " +p1.getBalance());
		p1.withdraw(5000);
		
	}
}