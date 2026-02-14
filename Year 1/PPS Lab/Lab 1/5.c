#include <stdio.h>
#include <math.h>

void main(){
    float P, N, R, SI, CI;
    printf("Enter P, N and R:");
    scanf("%f%f%f", &P, &N, &R);
    SI = (P*N*R)/100;
    CI = P* pow((1+R/100), N) - P;
    printf("SI = %.2f\nCI = %.2f", SI, CI);
}
