#include <stdio.h>

long Fact(int n) {
    if (n == 0 || n == 1)
        return 1;
    else
        return n * Fact(n - 1);
}

int main() {
    int n, r;
    long nCr;

    printf("Enter value of n: ");
    scanf("%d", &n);
    printf("Enter value of r: ");
    scanf("%d", &r);

    if (r > n) {
        printf("Invalid input! r cannot be greater than n.\n");
    } else {
        nCr = Fact(n) / (Fact(r) * Fact(n - r));
        printf("Value of %dC%d = %ld\n", n, r, nCr);
    }

    return 0;
}
