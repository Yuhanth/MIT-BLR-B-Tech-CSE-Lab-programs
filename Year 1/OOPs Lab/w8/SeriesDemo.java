package w8;

import java.util.*;

// Interface
interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}

// Implementation
class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

// Main class
public class SeriesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Series s = new ByTwos();

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();
        s.setStart(start);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(s.getNext() + " ");
        }

        System.out.println("\nResetting series...");
        s.reset();

        System.out.println("After reset:");
        for (int i = 0; i < n; i++) {
            System.out.print(s.getNext() + " ");
        }

        sc.close();
    }
}