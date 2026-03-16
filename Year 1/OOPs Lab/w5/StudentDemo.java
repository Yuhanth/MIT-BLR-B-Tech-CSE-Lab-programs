package w5;

import java.util.Scanner;

class Student {

    String studentName;
    int subjectCount;
    Subject[] subjects;
    int index = 0;

    // Inner Class
    class Subject {
        String subjectName;
        int marks;

        void assignMarks(String name, int m) {
            subjectName = name;
            marks = m;
        }

        void displaySubject() {
            System.out.println("Subject: " + subjectName + " | Marks: " + marks);
        }
    }

    Student(String name, int count) {
        studentName = name;
        subjectCount = count;
        subjects = new Subject[count];
    }

    void addSubject(String name, int marks) {
        if (index < subjectCount) {
            subjects[index] = new Subject();
            subjects[index].assignMarks(name, marks);
            index++;
        }
    }

    void calculateResult() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total += subjects[i].marks;
        }
        double average = (double) total / index;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    void displayStudent() {
        System.out.println("\nStudent Name: " + studentName);
        for (int i = 0; i < index; i++) {
            subjects[i].displaySubject();
        }
        calculateResult();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student s = new Student(name, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject Name: ");
            String sub = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            s.addSubject(sub, marks);
        }

        s.displayStudent();
        sc.close();
    }
}