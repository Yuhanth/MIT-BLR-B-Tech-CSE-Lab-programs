package w6;

import java.util.*;

class Employee {

    int id;
    String name;

    // Parameterized Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to format employee name
    String formatEmployeeName() {
        String words[] = name.toLowerCase().split(" ");
        String formatted = "";

        for (String w : words) {
            formatted += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        return formatted.trim();
    }

    // Method to generate email
    String generateEmail() {
        String words[] = name.toLowerCase().split(" ");

        if (words.length >= 2) {
            return words[0].charAt(0) + words[1] + "@example.com";
        } else {
            return words[0] + "@example.com";
        }
    }

    // Display details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Original Name: " + name);
        System.out.println("Formatted Name: " + formatEmployeeName());
        System.out.println("Generated Email: " + generateEmail());
        System.out.println();
    }
}

public class EmployeeProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            emp[i] = new Employee(id, name);
        }

        System.out.println("\nEmployee Details");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}