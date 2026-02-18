package w4;

import java.util.Scanner;

class BankAccount {
    String name;
    int accNo;
    String accType;
    double balance;
    static double rateOfInterest = 6.5;
    static double minBalance = 1000;

    BankAccount() {
        name = "Not Assigned";
        accNo = 0;
        accType = "Savings";
        balance = 0.0;
    }

    BankAccount(String n, int a, String t, double b) {
        name = n;
        accNo = a;
        accType = t;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance! Minimum balance must be maintained.");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }

    static void showRateOfInterest() {
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount b2 = new BankAccount(name, accNo, type, balance);

        b1.display();
        b2.display();

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        b2.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        b2.withdraw(wd);

        b2.display();

        BankAccount.showRateOfInterest();

        sc.close();
    }
}