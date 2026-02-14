#include <stdio.h>
#include <math.h>

int main() {
    int n;
    double x, term, sum;
    printf("Enter value of x (in radians): ");
    scanf("%lf", &x);
    printf("Enter number of terms: ");
    scanf("%d", &n);

    sum = 0.0;
    for (int i = 0; i < n; i++) {
        int power = 2 * i + 1;
        long long fact = 1;
        for (int j = 1; j <= power; j++)
            fact *= j;

        term = pow(x, power) / fact;

        if (i % 2 == 0)
            sum += term;
        else
            sum -= term;
    }

    printf("sin(%.2lf) = %.6lf (aprox\.)\n", x, sum);
    return 0;
}
