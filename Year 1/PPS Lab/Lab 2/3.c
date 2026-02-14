#include <stdio.h>
#include <math.h>

int main() {
    float a, b, c, desc, re, im, root1, root2;
    int d;
    printf("Enter coefficients a, b, c: ");
    scanf("%f%f%f", &a, &b, &c);
    desc = pow(b, 2) - 4 * a * c;


    if (desc < 0)
        d = 0;
    else if (desc == 0)
        d = 1;
    else
        d = 2;

    switch (d)
    {
    case 0:
        re = -b / (2 * a);
        im = sqrt(-desc) / (2 * a);
        printf("The roots are %.2f + i%.2f and %.2f - i%.2f", re, im, re, im);
        break;
    case 1:
        root1 = -b /(2*a) ;
        printf("The roots is %f", root1);
        break;
    case 2:
        root1 = ( -b + sqrt(desc) ) / (2 * a);
        root2 = ( -b - sqrt(desc) ) / (2 * a);
        printf("The roots are %f and %f", root1, root2);
        break;
    default:
        break;
    }
}
