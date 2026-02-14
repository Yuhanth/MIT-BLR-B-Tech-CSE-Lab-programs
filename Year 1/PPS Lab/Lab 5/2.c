#include <stdio.h>

int main() {
    int n, i, j, temp;
    char choice;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Enter choice (a for ascending, d for descending): ");
    scanf(" %c", &choice);

    switch (choice) {
        case 'a':   // Ascending
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printf("Array in Ascending order: ");
            for (i = 0; i < n; i++) printf("%d ", arr[i]);
            break;

        case 'd':   // Descending
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            printf("Array in Descending order: ");
            for (i = 0; i < n; i++) printf("%d ", arr[i]);
            break;

        default:
            printf("Invalid choice!\n");
    }

    return 0;
}
