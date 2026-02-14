#include <stdio.h>

int main() {
    int n, i, j, flag;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Prime numbers: ");
    for (i = 0; i < n; i++) {
        if (arr[i] <= 1) continue;

        flag = 1;
        for (j = 2; j * j <= arr[i]; j++) {
            if (arr[i] % j == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) printf("%d ", arr[i]);
    }

    return 0;
}
