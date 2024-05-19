/*
Implement the concept of oops and methods from an Automated Teller Machine (ATM) where the user can withdraw, deposit, and check their balance.
 
Input:
The first line contains the Debit card number
The second line contain the security pin
and then display the options for Deposit Withdraw and Balance Inquiry.

Output:
Will be according to the input and User-friendly.
 
Constrains:
Balance of the Customers will be Programmer Defined
Withdraw >=100, <=10000; and must be divisible by 100
Deposit >0
<= 100000; and must be divisible by 100
*/

import java.util.Scanner;
public class ATM_question
{
    public static void main(String[] args)
    { 
    	Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Debit Card Number: ");
        int debit_card_no = s.nextInt();
        System.out.println("Enter Security Pin");
        int security_pin = s.nextInt();

        if(debit_card_no == 99887766 && security_pin == 7788)
        {
        	int balance = 10000, withdraw, deposit;
        	while(true)
        	{
            	System.out.println("(ATM) Automated Teller Machine");
            	System.out.println("Choose 1 for Withdraw");
            	System.out.println("Choose 2 for Deposit");
            	System.out.println("Choose 3 for Check Balance");
            	System.out.println("Choose 4 for EXIT");
            	System.out.print("Choose the operation you want to perform: ");
            	int n = s.nextInt();
            	switch(n)
            	{
                	case 1:
                	System.out.print("Enter money to be withdrawn: ");
                	withdraw = s.nextInt();
                	if(balance >= withdraw)
                	{
                    	balance = balance - withdraw;
                    	System.out.println("Please collect your money");
                	}
                	else
                	{
                    	System.out.println("Insufficient Balance");
                	}
                	System.out.println("");
                	break;
 
                	case 2:
                	System.out.print("Enter money to be deposited:");
                	deposit = s.nextInt();
                	balance = balance + deposit;
                	System.out.println("Your Money has been successfully deposited");
                	System.out.println("");
                	break;
 
                	case 3:
                	System.out.println("Balance : "+balance);
                	System.out.println("");
                	break;
 
                	case 4:
                	System.exit(0);
                }
            }
        }
        else
        {
        	System.out.println("Please Enter currect Debit Card no. and Security Pin. \n");
        }
    }
}