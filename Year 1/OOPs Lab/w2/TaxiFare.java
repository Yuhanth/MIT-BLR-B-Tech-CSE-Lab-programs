package w2;

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total distance (km): ");
        double distance = sc.nextDouble();

        double fare = 0;

        if (distance <= 5) {
            fare = distance * 10;
        } else if (distance <= 20) {
            fare = (5 * 10) + (distance - 5) * 8;
        } else {
            fare = (5 * 10) + (15 * 8) + (distance - 20) * 5;
        }

        System.out.println("Total Taxi Fare = ₹" + fare);
        sc.close();
    }
}
