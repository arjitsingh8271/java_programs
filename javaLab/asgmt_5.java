/*
Design a class representing a "BankAccount" with private 
attributes such as account number, balance, and account holder 
name. Use encapsulation to provide public methods for deposit, 
withdrawal, and displaying account details while ensuring data 
integrity.
*/

class BankAccount 
{
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance, String accountHolderName) 
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    /*
    // Getters and Setters for private attributes (optional)
    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    */
}


class asgmt_5 
{
    public static void main(String[] args) 
    {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");

        // Display initial account details
        System.out.println("Account Details:");
        account.displayAccountDetails();

        // Deposit money into the account
        System.out.println("\nDepositing");
        account.deposit(500.0);

        // Withdraw money from the account
        System.out.println("\nWithdrawing");
        account.withdraw(200.0);

        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account.displayAccountDetails();
    }
}


/*
OUTPUT: Account Details:                                                            
		Account Number: 123456789
		Account Holder Name: John Doe
		Balance: 1000.0

		Depositing
		500.0 deposited successfully.

		Withdrawing
		200.0 withdrawn successfully.

		Updated Account Details:
		Account Number: 123456789
		Account Holder Name: John Doe
		Balance: 1300.0
*/