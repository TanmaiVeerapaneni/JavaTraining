package StaticandNonStaticAsst;

public class BankAccount {
	    // Instance variables
	    int accountNumber;
	    String accountHolderName;
	    double balance;

	    // Constructor to initialize the account
	    public BankAccount(int accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	    }

	    // Method to deposit amount into account
	    public void deposit(double amount) {
	        // Local variable to temporarily hold updated balance
	        double newBalance = balance + amount;
	        balance = newBalance;  // update the instance variable
	        System.out.println("Deposited $" + amount + " successfully.");
	    }

	    // Method to display account details
	    public void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Current Balance: $" + balance);
	        System.out.println("--------------------------");
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Create a bank account
	        BankAccount acc = new BankAccount(123456, "Jane Doe", 1000.00);

	        // Display initial details
	        acc.displayAccount();

	        // Deposit money
	        acc.deposit(500.00);

	        // Display updated details
	        acc.displayAccount();
	    }
	}

