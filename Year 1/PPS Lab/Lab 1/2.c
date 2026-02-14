#include <stdio.h>

void main(){
    float a,b,sum,difference,product,quotient;
    printf("Enter a,b: ");
    scanf("%f%f",&a,&b);
    sum = a + b;
    printf("Sum = %.2f\n", sum);
    difference = a - b;
    printf("Difference = %.2f\n", difference);
    product = a * b;
    printf("Product = %.2f\n", product);
    if (b!=0){
        quotient = a/b;
        printf("Quotient = %.2f\n", quotient);
    }
    else {
        printf("Division by zero error");
    }
}
