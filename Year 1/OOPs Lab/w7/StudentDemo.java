import java.util.*;

// Base class
class Student {
    String name;
    int rollNo;
    int marks[];

    Student(String name, int rollNo, int marks[]) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void compute() {
        int total = 0;
        for (int m : marks) total += m;
        double avg = total / (double) marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Subclass ScienceStudent
class ScienceStudent extends Student {
    int practicalMarks;

    ScienceStudent(String name, int rollNo, int marks[], int practicalMarks) {
        super(name, rollNo, marks); // using super
        this.practicalMarks = practicalMarks;
    }

    void compute() {
        int total = practicalMarks;
        for (int m : marks) total += m;
        double avg = total / (double) (marks.length + 1);

        System.out.println("Total (with practical): " + total);
        System.out.println("Average: " + avg);
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

// Subclass ArtsStudent
class ArtsStudent extends Student {
    String electiveSubject;

    ArtsStudent(String name, int rollNo, int marks[], String electiveSubject) {
        super(name, rollNo, marks);
        this.electiveSubject = electiveSubject;
    }

    void display() {
        super.display();
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();

        int marks[] = new int[3];
        System.out.println("Enter 3 subject marks:");
        for (int i = 0; i < 3; i++) marks[i] = sc.nextInt();

        System.out.print("Enter practical marks: ");
        int practical = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter elective subject: ");
        String elective = sc.nextLine();

        // Dynamic polymorphism
        Student s;

        System.out.println("\n--- Science Student ---");
        s = new ScienceStudent(name, roll, marks, practical);
        s.display();
        s.compute();

        System.out.println("\n--- Arts Student ---");
        s = new ArtsStudent(name, roll, marks, elective);
        s.display();
        s.compute();

        sc.close();
    }
}