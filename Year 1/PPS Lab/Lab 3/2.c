#include <stdio.h>

int main() {
    int low, high, i, j, isPrime;
    printf("Enter lower and upper limits: ");
    scanf("%d %d", &low, &high);

    i = low;
    while(i <= high) {
        if(i > 1) {
            isPrime = 1;
            j = 2;
            while(j <= i/2) {
                if(i % j == 0) {
                    isPrime = 0;
                    break;
                }
                j++;
            }
            if(isPrime)
                printf("%d ", i);
        }
        i++;
    }
    return 0;
}
