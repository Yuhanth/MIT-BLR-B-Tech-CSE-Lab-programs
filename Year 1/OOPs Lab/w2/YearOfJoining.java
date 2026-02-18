package w2;

import java.util.Scanner;

public class YearOfJoining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 9-digit registration number: ");
        String regNo = sc.next();

        String year = regNo.substring(0, 2);

        System.out.println("Year of Joining: 20" + year);
        sc.close();
    }
}
