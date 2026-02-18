package w4;

import java.util.Scanner;

class STUDENT {
    int rollNo;
    String name;
    double marks;

    // Default Constructor
    STUDENT() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    // Parameterized Constructor
    STUDENT(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default constructor object
        STUDENT s1 = new STUDENT();

        // Taking user input
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Marks: ");
        double m = sc.nextDouble();

        STUDENT s2 = new STUDENT(r, n, m);

        System.out.println("\nStudent 1 Details (Default Constructor):");
        s1.display();

        System.out.println("\nStudent 2 Details (Parameterized Constructor):");
        s2.display();

        sc.close();
    }
}
