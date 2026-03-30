package w8;
import java.util.*;

// Abstract class
abstract class Figure {
    int x, y;

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void area();
}

// Rectangle
class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (x * y));
    }
}

// Triangle
class Triangle extends Figure {
    Triangle(int x, int y) {
        super(x, y);
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * x * y));
    }
}

// Square
class Square extends Figure {
    Square(int side) {
        super(side, side);
    }

    void area() {
        System.out.println("Area of Square: " + (x * x));
    }
}

// Main class
public class FigureDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter base and height of Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();

        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();

        Figure f; // dynamic polymorphism

        System.out.println("\n--- Rectangle ---");
        f = new Rectangle(l, b);
        f.area();

        System.out.println("\n--- Triangle ---");
        f = new Triangle(base, height);
        f.area();

        System.out.println("\n--- Square ---");
        f = new Square(side);
        f.area();

        sc.close();
    }
}