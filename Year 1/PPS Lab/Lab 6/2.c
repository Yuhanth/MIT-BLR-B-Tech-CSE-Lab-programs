#include <stdio.h>
#include <math.h>

int main() {
    int n, i, j, trace = 0;
    float norm = 0;

    printf("Enter order of square matrix: ");
    scanf("%d", &n);
    int a[n][n];

    printf("Enter elements of the matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++) {
            if (i == j)
                trace += a[i][j];
            norm += a[i][j] * a[i][j];
        }

    norm = sqrt(norm);

    printf("Trace of the matrix = %d\n", trace);
    printf("Norm of the matrix = %.2f\n", norm);

    return 0;
}
