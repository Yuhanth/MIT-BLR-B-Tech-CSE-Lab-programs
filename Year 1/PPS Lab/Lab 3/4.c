#include <stdio.h>

int main() {
    int num, countPrime = 0, countComposite = 0, i, isPrime;

    do {
        printf("Enter a number (-1 to stop): ");
        scanf("%d", &num);

        if(num == -1)
            break;
        if(num <= 1)
            continue;

        isPrime = 1;
        i = 2;
        while(i <= num/2) {
            if(num % i == 0) {
                isPrime = 0;
                break;
            }
            i++;
        }

        if(isPrime)
            countPrime++;
        else
            countComposite++;

    } while(num != -1);

    printf("Total primes: %d\n", countPrime);
    printf("Total composites: %d\n", countComposite);

    return 0;
}
