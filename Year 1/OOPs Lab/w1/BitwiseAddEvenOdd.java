package w1;
import java.util.Scanner;

public class BitwiseAddEvenOdd {

    // Method to add two numbers using bitwise operators
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;   // carry bits
            a = a ^ b;           // sum without carry
            b = carry << 1;      // left shift carry
        }
        return a;
    }

    // Method to check even or odd using bitwise operator
    public static void checkEvenOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println("The result is EVEN");
        } else {
            System.out.println("The result is ODD");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int sum = add(x, y);

        System.out.println("Sum = " + sum);
        checkEvenOdd(sum);

        sc.close();
    }
}
