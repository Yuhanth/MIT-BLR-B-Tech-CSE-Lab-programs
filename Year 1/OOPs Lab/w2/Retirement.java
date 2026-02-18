package w2;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
        String dob = sc.next();

        String[] p = dob.split("/");
        int year = Integer.parseInt(p[2]) + 60;

        System.out.println("Retirement Date: " + p[0] + "/" + p[1] + "/" + year);
        sc.close();
    }
}
