package w8;

import java.util.*;

// Interface
interface Sports {
    void putSportsScore(int score);
}

// Student class
class Student {
    int rollNo;
    int marks;

    void getRollNum(int r) {
        rollNo = r;
    }

    void putRollNum() {
        System.out.println("Roll No: " + rollNo);
    }

    void getMarks(int m) {
        marks = m;
    }

    void putMarks() {
        System.out.println("Marks: " + marks);
    }
}

// Result class
class Result extends Student implements Sports {
    int sportsScore;
    int total;

    public void putSportsScore(int score) {
        sportsScore = score;
    }

    void display() {
        total = marks + sportsScore;

        putRollNum();
        putMarks();
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total: " + total);
    }
}

// Main class
public class ResultDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int sports = sc.nextInt();

        r.getRollNum(roll);
        r.getMarks(marks);
        r.putSportsScore(sports);

        System.out.println("\n--- Result ---");
        r.display();

        sc.close();
    }
}