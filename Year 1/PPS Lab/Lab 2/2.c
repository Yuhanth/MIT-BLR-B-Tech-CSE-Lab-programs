#include <stdio.h>

int main() {
    int a, b, c, greatest;
    printf("Enter 3 numbers: ");
    scanf("%d%d%d", &a, &b, &c);

    greatest = a;

    if (b > greatest)
        greatest = b;
    if (c > greatest)
        greatest = c;

    printf("%d is the greatest number.", greatest);
}
