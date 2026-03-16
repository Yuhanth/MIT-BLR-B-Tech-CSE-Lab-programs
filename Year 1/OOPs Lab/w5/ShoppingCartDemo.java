package w5;

import java.util.Scanner;

class ShoppingCart {

    Item[] items;
    int index = 0;

    // Inner Class
    class Item {
        String itemName;
        int quantity;
        double price;

        void setItem(String name, int qty, double pr) {
            itemName = name;
            quantity = qty;
            price = pr;
        }

        double getTotal() {
            return quantity * price;
        }

        void displayItem() {
            System.out.println(itemName + 
                               " | Qty: " + quantity + 
                               " | Price: " + price +
                               " | Total: " + getTotal());
        }
    }

    ShoppingCart(int count) {
        items = new Item[count];
    }

    void addItem(String name, int qty, double price) {
        if (index < items.length) {
            items[index] = new Item();
            items[index].setItem(name, qty, price);
            index++;
        }
    }

    void displayCart() {
        double grandTotal = 0;

        for (int i = 0; i < index; i++) {
            items[i].displayItem();
            grandTotal += items[i].getTotal();
        }

        System.out.println("Grand Total: " + grandTotal);
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        ShoppingCart cart = new ShoppingCart(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            cart.addItem(name, qty, price);
        }

        cart.displayCart();
        sc.close();
    }
}