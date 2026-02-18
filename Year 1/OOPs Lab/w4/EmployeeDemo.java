package w4;

import java.util.Scanner;

class EMPLOYEE {
    int empId;
    String name;
    double salary;

    EMPLOYEE() {
        empId = 0;
        name = "Unknown";
        salary = 0.0;
    }

    EMPLOYEE(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EMPLOYEE e1 = new EMPLOYEE();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        EMPLOYEE e2 = new EMPLOYEE(id, name, salary);

        System.out.println("\nEmployee 1 (Default):");
        e1.display();

        System.out.println("Employee 2 (Parameterized):");
        e2.display();

        sc.close();
    }
}
