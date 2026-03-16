package w5;

import java.util.Scanner;

class Employee {

    String eName;
    double salary;
    Department[] departments;
    int index = 0;

    // Inner Class
    class Department {
        String departmentName;
        String location;

        void setDepartment(String name, String loc) {
            departmentName = name;
            location = loc;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName + 
                               " | Location: " + location);
        }
    }

    Employee(String name, double sal, int count) {
        eName = name;
        salary = sal;
        departments = new Department[count];
    }

    void addDepartment(String name, String loc) {
        if (index < departments.length) {
            departments[index] = new Department();
            departments[index].setDepartment(name, loc);
            index++;
        }
    }

    void displayEmployee() {
        System.out.println("\nEmployee Name: " + eName);
        System.out.println("Salary: " + salary);

        for (int i = 0; i < index; i++) {
            departments[i].displayDepartment();
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Number of Departments: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee emp = new Employee(name, salary, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Department Name: ");
            String dName = sc.nextLine();

            System.out.print("Enter Location: ");
            String loc = sc.nextLine();

            emp.addDepartment(dName, loc);
        }

        emp.displayEmployee();
        sc.close();
    }
}