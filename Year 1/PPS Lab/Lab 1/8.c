#include <stdio.h>

void main() {
    int a = 30, b = 10, c = 5, d = 15;
    int result1, result2, result3, result4;

    result1 = (a + b) * c / d;
    result2 = ((a + b) * c) / d;
    result3 = a + (b * c) / d;
    result4 = (a + b) * (c / d);

    printf("Result1 = %d\n", result1);
    printf("Result2 = %d\n", result2);
    printf("Result3 = %d\n", result3);
    printf("Result4 = %d\n", result4);
}
