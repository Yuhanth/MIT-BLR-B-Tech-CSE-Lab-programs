#include <stdio.h>

int main() {
    int a, b, c, smallest;
    printf("Enter 3 numbers: ");
    scanf("%d%d%d", &a, &b, &c);

    smallest = a;

    if (b < smallest)
        smallest = b;
    if (c < smallest)
        smallest = c;

    printf("%d is the smallest number.\n", smallest);

    return 0;
}
