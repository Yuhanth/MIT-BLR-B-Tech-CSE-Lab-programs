package w1;
import java.util.Scanner;

public class ArrayRotation {
    static void rotateLeft(int[] arr, int steps) {
        int n = arr.length;
        steps %= n;

        for (int i = 0; i < steps; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    static void rotateRight(int[] arr, int steps) {
        int n = arr.length;
        steps %= n;

        for (int i = 0; i < steps; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter steps: ");
        int steps = sc.nextInt();

        System.out.print("Rotate Left or Right (L/R): ");
        char dir = sc.next().charAt(0);

        if (dir == 'L' || dir == 'l')
            rotateLeft(arr, steps);
        else
            rotateRight(arr, steps);

        System.out.println("Rotated Array:");
        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}
