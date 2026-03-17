package w6;

import java.util.*;

class Student {

    int id;
    String name;

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to extract initials
    String extractInitials() {
        String words[] = name.split(" ");
        String initials = "";

        for (String w : words) {
            initials += Character.toUpperCase(w.charAt(0));
        }

        return initials;
    }

    // Method to remove whitespace
    String removeWhitespace() {
        return name.replaceAll("\\s", "");
    }

    // Display student details
    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class StudentProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student s[] = new Student[n];

        // Reading student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            s[i] = new Student(id, name);
        }

        // Display all students
        System.out.println("\nStudent Details:");
        for (Student st : s) {
            st.display();
        }

        // Demonstrate methods
        System.out.println("\nInitials and Names without Whitespace:");
        for (Student st : s) {
            System.out.println(st.name + 
                " -> Initials: " + st.extractInitials() +
                " | No Space: " + st.removeWhitespace());
        }

        // List students containing substring
        System.out.print("\nEnter substring to search: ");
        String sub = sc.nextLine();

        System.out.println("Students containing '" + sub + "':");
        for (Student st : s) {
            if (st.name.toLowerCase().contains(sub.toLowerCase())) {
                System.out.println(st.name);
            }
        }

        // Sort students alphabetically
        Arrays.sort(s, Comparator.comparing(st -> st.name));

        System.out.println("\nStudents sorted alphabetically:");
        for (Student st : s) {
            System.out.println(st.name);
        }

        sc.close();
    }
}