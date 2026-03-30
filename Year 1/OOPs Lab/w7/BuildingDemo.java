import java.util.*;

class Building {
    int squareFeet, stories;

    Building(int squareFeet, int stories) {
        this.squareFeet = squareFeet;
        this.stories = stories;
    }

    void display() {
        System.out.println("Square Feet: " + squareFeet);
        System.out.println("Stories: " + stories);
    }
}

class House extends Building {
    int bedrooms, baths;

    House(int sq, int st, int bed, int bath) {
        super(sq, st);
        bedrooms = bed;
        baths = bath;
    }

    void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + baths);
    }
}

class School extends Building {
    int classrooms;
    String gradeLevel;

    School(int sq, int st, int cls, String grade) {
        super(sq, st);
        classrooms = cls;
        gradeLevel = grade;
    }

    void display() {
        super.display();
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class BuildingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square feet: ");
        int sq = sc.nextInt();

        System.out.print("Enter stories: ");
        int st = sc.nextInt();

        System.out.print("Enter bedrooms: ");
        int bed = sc.nextInt();

        System.out.print("Enter bathrooms: ");
        int bath = sc.nextInt();

        System.out.print("Enter classrooms: ");
        int cls = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter grade level: ");
        String grade = sc.nextLine();

        System.out.println("\n--- House ---");
        House h = new House(sq, st, bed, bath);
        h.display();

        System.out.println("\n--- School ---");
        School s = new School(sq, st, cls, grade);
        s.display();

        sc.close();
    }
}