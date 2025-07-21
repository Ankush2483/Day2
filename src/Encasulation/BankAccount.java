package Encasulation;
//Make a BankAccount class with a private balance field and public deposit() and withdraw() methods.
public class BankAccount {
        // Private field to store the balance
        private double balance;

        // Constructor to initialize the balance (optional)
        public BankAccount()  {
            this.balance = 0.0;
        }

        // Public method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
        }
        // Optional: Method to check current balance
        public double getBalance() {
            return balance;
        }

        // Main method for testing
        public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.deposit(100);
            account.withdraw(40);
            account.withdraw(100);
            System.out.println("Final Balance: " + account.getBalance());
        }
    }




