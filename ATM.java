import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn ₹" + amount + " successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this transaction.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating a new BankAccount object with ₹1000 as default balance
        BankAccount userAccount = new BankAccount(1000.0);

        int choice = 0;

        // ATM interface loop
        while (choice != 4) {
            System.out.println("\n--- Welcome to Simple ATM ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    userAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }

        sc.close();
    }
}