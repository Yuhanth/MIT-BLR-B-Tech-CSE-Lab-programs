package w3;

import java.util.Random;

class Die {
    int sideUp;

    // Method to roll the die
    void roll() {
        Random rand = new Random();
        sideUp = rand.nextInt(6) + 1;  // 1 to 6
    }

    // Method to return sideUp value
    int getSideUp() {
        return sideUp;
    }
}

public class DieDemo {
    public static void main(String[] args) {

        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();

        int sum = d1.getSideUp() + d2.getSideUp();

        System.out.println("Die 1: " + d1.getSideUp());
        System.out.println("Die 2: " + d2.getSideUp());
        System.out.println("Sum of two dice: " + sum);
    }
}
