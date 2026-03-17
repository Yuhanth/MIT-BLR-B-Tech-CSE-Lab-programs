package w6;

import java.util.Scanner;
import java.util.Arrays;

public class StringMenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Alphabetical Order");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original and Reversed");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    String rev = new StringBuilder(str).reverse().toString();
                    if (str.equalsIgnoreCase(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 2:
                    char arr[] = str.toCharArray();
                    Arrays.sort(arr);
                    System.out.println("Alphabetical Order: " + new String(arr));
                    break;

                case 3:
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 4:
                    String r = new StringBuilder(str).reverse().toString();
                    System.out.println("Concatenated String: " + str + r);
                    break;

                case 5:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}