class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int a, String n, double b) {
        accountNumber = a;
        accountHolderName = n;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Money deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Money withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Shaswat", 5000);
        BankAccount a2 = new BankAccount(102, "Rahul", 3000);

        System.out.println("Account 1");
        a1.deposit(1000);
        a1.withdraw(500);
        a1.checkBalance();

        System.out.println();

        System.out.println("Account 2");
        a2.deposit(2000);
        a2.withdraw(1000);
        a2.checkBalance();

        System.out.println();

        System.out.println("Final Details");

        a1.displayDetails();

        System.out.println();

        a2.displayDetails();
    }
}
