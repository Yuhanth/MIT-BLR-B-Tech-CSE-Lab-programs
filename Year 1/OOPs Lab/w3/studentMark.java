package w3;
import java.util.Scanner;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    float avg;

    // Method to assign initial values
    void assign() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        marks_array = new int[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks_array[i] = sc.nextInt();
        }
        sc.close();
    }

    // Method to compute total and average
    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (float) total / marks_array.length;
    }

    // Method to display student details
    void display() {
        System.out.println("\nStudent Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class studentMark {
    public static void main(String[] args) {
        STUDENT s = new STUDENT();   // Object creation

        s.assign();   // Accessing class members
        s.compute();
        s.display();
    }
}
