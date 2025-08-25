import java.util.*;

class Account
{
	String accountNumber;
	String customerName;
	double balance;

	void createAccount(String accNo, String name, double amount){
		accountNumber = accNo;
		customerName = name;
		balance = amount;
	}

	void deposit(double amount){
		balance += amount
		System.out.println("Amount" + amount + "deposited");
	}

	void withdraw(double amount){
		if(amount <= balance){
			balance -= amount;
			System.out.println("Amount " + amount + "withdraw");
		}
		else{
			System.out.println("Insufficient balance.")
		}
	}

	void display{
		System.out.println("Account No : " + accountNumber + "Name : " + customerName + "Balance : " + balance);
	}
}

class Bank
{
	public static void main(String gg[]){
		Scanner sc = new Scanner(System.in);
		Account[] account = new Account[5];
		int count = 0;

		while(true){
			System.out.println("\n=== Bank Menu ===");
			System.out.println("\n1. Create Account");
			System.out.println("\n2. Deposit Money");
			System.out.println("\n3. Withdraw Money");
			System.out.println("\n4. Display all account");
			System.out.println("\n5. Exit");
			System.out.println("\nEnter your Choice : ");
			int ch = sc.nextInt();
			sc.nextLine();

			if(ch == 1){
				
			}
		}
	}
}