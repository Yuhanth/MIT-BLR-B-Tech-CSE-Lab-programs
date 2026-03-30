package w6;

import java.util.*;

class Employee {
    String name;

    // Parameterized constructor
    Employee(String name) {
        this.name = name;
    }

    // Format name
    void formatEmployeeName() {
        String[] w = name.toLowerCase().split(" ");
        name = "";
        for (String s : w)
            name += Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ";
        name = name.trim();
    }

    // Generate email
    String generateEmail() {
        String[] w = name.split(" ");
        return (w[0].charAt(0) + w[w.length - 1]).toLowerCase() + "@xyz.com";
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            e[i] = new Employee(sc.nextLine());
            e[i].formatEmployeeName();
        }

        for (Employee emp : e)
            System.out.println(emp.name + " -> " + emp.generateEmail());
        sc.close();
    }
}