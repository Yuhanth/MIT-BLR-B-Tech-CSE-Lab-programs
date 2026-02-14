#include <stdio.h>

int main() {
    int n, i, j;
    int r1, r2, c1, c2, temp;

    printf("Enter order of square matrix: ");
    scanf("%d", &n);
    int a[n][n];

    printf("Enter elements of the matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    printf("Enter the two rows to interchange (1 to %d): ", n);
    scanf("%d %d", &r1, &r2);
    r1--; r2--;

    for (j = 0; j < n; j++) {
        temp = a[r1][j];
        a[r1][j] = a[r2][j];
        a[r2][j] = temp;
    }

    printf("Enter the two columns to interchange (1 to %d): ", n);
    scanf("%d %d", &c1, &c2);
    c1--; c2--;

    for (i = 0; i < n; i++) {
        temp = a[i][c1];
        a[i][c1] = a[i][c2];
        a[i][c2] = temp;
    }

    printf("\nMatrix after interchanging rows and columns:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++)
            printf("%d\t", a[i][j]);
        printf("\n");
    }

    return 0;
}
