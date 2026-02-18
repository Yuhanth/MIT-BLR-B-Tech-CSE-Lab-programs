package w3;
import java.util.Scanner;

class Mixer {
    int arr[];
    static Scanner sc = new Scanner(System.in);

    // Accept elements in ascending order
    void accept() {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter elements in ascending order (no duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Merge two sorted arrays
    Mixer mix(Mixer A) {
        Mixer result = new Mixer();

        int i = 0, j = 0, k = 0;
        result.arr = new int[this.arr.length + A.arr.length];

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                result.arr[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                result.arr[k++] = A.arr[j++];
            } else {
                result.arr[k++] = this.arr[i++];
                j++; // skip duplicate
            }
        }

        while (i < this.arr.length)
            result.arr[k++] = this.arr[i++];

        while (j < A.arr.length)
            result.arr[k++] = A.arr[j++];

        // resize array
        int[] temp = new int[k];
        for (int x = 0; x < k; x++)
            temp[x] = result.arr[x];

        result.arr = temp;
        return result;
    }

    // Display elements
    void display() {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        System.out.println("Enter first sorted array:");
        m1.accept();

        System.out.println("Enter second sorted array:");
        m2.accept();

        Mixer m3 = m1.mix(m2);

        System.out.println("Merged Array:");
        m3.display();
    }
}
