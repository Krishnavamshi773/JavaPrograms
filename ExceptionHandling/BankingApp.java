package ExceptionHandling; // Package declaration

public class BankingApp { // Class declaration
    int accountNo; // Variable to store account number
    int balance; // Variable to store account balance

    // Constructor to initialize account number and balance
    public BankingApp(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Method to deposit amount into the account
    void deposit(int amt) {
        balance += amt; // Add the deposit amount to the balance
        System.out.println("New Balance: " + balance); // Print the new balance
    }

    // Method to withdraw amount from the account
    void withdraw(int amt) throws InsufficientBalanceException {
        if (balance >= amt) { // Check if the balance is sufficient for withdrawal
            balance -= amt; // Subtract the withdrawal amount from the balance
            System.out.println("Amount withdrawn successfully: " + amt + "\nNew Balance: " + balance); // Print the withdrawn amount and new balance
        } else {
            // Throw an exception if the balance is insufficient
            throw new InsufficientBalanceException("Insufficient Balance");
        }
    }

    // Custom exception class for insufficient balance
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) {
            super(msg); // Call the superclass constructor with the message
        }
    }

    // Main method to test the BankingApp class
    public static void main(String[] args) throws InsufficientBalanceException {
        // Create a new BankingApp object with account number and initial balance
        BankingApp bankingApp = new BankingApp(3216532, 200000);
        bankingApp.deposit(5000); // Deposit an amount
        try {
            bankingApp.withdraw(30000); // Attempt to withdraw an amount
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Print the exception message if caught
        }
    }
}
