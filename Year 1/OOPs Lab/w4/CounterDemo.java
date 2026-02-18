package w4;

import java.util.Scanner;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class CounterDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Counter objects to create: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Counter c = new Counter();
        }

        Counter.showCount();

        sc.close();
    }
}
