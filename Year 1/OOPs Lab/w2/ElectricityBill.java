package w2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter daily consumption for 7 days:");
        for (int i = 1; i <= 7; i++)
            total += sc.nextInt();

        double bill;

        switch (total / 100) {
            case 0:
                bill = total * 7;
                break;
            case 1:
                bill = 100 * 7 + (total - 100) * 8;
                break;
            default:
                bill = 100 * 7 + 100 * 8 + (total - 200) * 10;
        }

        System.out.println("Total Electricity Bill = ₹" + bill);
        
        sc.close();
    }
}
