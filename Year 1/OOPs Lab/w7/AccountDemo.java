import java.util.*;

class Account {
    String name;
    int accNo;
    String type;
    double balance;

    Account(String name, int accNo, String type, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Acc No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String n, int a, double b) {
        super(n, a, "Savings", b);
    }

    void computeInterest() {
        balance += balance * 0.04;
    }

    void withdraw(double amt) {
        if (balance >= amt)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }
}

class CurrentAccount extends Account {
    final double MIN_BAL = 1000;

    CurrentAccount(String n, int a, double b) {
        super(n, a, "Current", b);
    }

    void withdraw(double amt) {
        balance -= amt;
        if (balance < MIN_BAL) {
            System.out.println("Penalty applied!");
            balance -= 100;
        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int acc = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        SavingsAccount s = new SavingsAccount(name, acc, bal);
        CurrentAccount c = new CurrentAccount(name, acc, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();

        s.deposit(dep);
        s.computeInterest();

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();

        s.withdraw(wd);

        System.out.println("\n--- Savings Account ---");
        s.display();

        c.deposit(dep);
        c.withdraw(wd);

        System.out.println("\n--- Current Account ---");
        c.display();

        sc.close();
    }
}