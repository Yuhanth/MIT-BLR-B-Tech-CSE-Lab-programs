import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void calculateSalary() {}

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Part-time employee
class PartTimeEmp extends Employee {
    int hoursWorked;
    static final double hourlyRate = 200;

    PartTimeEmp(String name, int id, int hoursWorked) {
        super(name, id);
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        salary = hoursWorked * hourlyRate;
    }

    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Salary: " + salary);
    }
}

// Full-time employee
class FullTimeEmp extends Employee {
    double bonus, deductions;

    FullTimeEmp(String name, int id, double salary, double bonus, double deductions) {
        super(name, id);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    void calculateSalary() {
        salary = salary + bonus - deductions;
    }

    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

// Main class
public class EmpDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter hours worked (Part-time): ");
        int hours = sc.nextInt();

        System.out.print("Enter base salary (Full-time): ");
        double sal = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        System.out.print("Enter deductions: ");
        double deductions = sc.nextDouble();

        Employee e;

        System.out.println("\n--- Part-Time Employee ---");
        e = new PartTimeEmp(name, id, hours);
        e.calculateSalary();
        e.displayEmployeeDetails();

        System.out.println("\n--- Full-Time Employee ---");
        e = new FullTimeEmp(name, id, sal, bonus, deductions);
        e.calculateSalary();
        e.displayEmployeeDetails();

        sc.close();
    }
}