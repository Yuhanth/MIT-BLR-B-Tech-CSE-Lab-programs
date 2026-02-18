package w2;

import java.util.Scanner;

public class NonDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Non-principal diagonal elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i + j == n - 1) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];
                }

        System.out.println("\nSum = " + sum);
        sc.close();
    }
}
