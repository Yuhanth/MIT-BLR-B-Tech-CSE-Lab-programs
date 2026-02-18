package w1;

import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();

        String[] productNames = new String[n];
        double[] productPrices = new double[n];
        int[] productQuantities = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Name: ");
            productNames[i] = scanner.next();
            System.out.print("Price: ");
            productPrices[i] = scanner.nextDouble();
            System.out.print("Quantity: ");
            productQuantities[i] = scanner.nextInt();
        }

        double totalBill = 0;

        while (true) {
            System.out.print("Enter product name to purchase (or 'done' to finish): ");
            String productName = scanner.next();

            if (productName.equals("done")) {
                break;
            }

            int productIndex = -1;
            for (int i = 0; i < n; i++) {
                if (productNames[i].equals(productName)) {
                    productIndex = i;
                    break;
                }
            }

            if (productIndex == -1) {
                System.out.println("Product not found.");
                continue;
            }

            System.out.print("Enter quantity to purchase: ");
            int quantityToBuy = scanner.nextInt();

            if (quantityToBuy > productQuantities[productIndex]) {
                System.out.println("Insufficient stock. Available: " + productQuantities[productIndex]);
            } else {
                totalBill += quantityToBuy * productPrices[productIndex];
                productQuantities[productIndex] -= quantityToBuy;
                System.out.println("Added to bill.");
            }
        }

        System.out.printf("\nTotal Bill: ₹%.2f%n", totalBill);
        scanner.close();
    }
}
