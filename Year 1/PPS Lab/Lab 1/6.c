#include <stdio.h>
#include <math.h>

void main(){
    float radius,surface_area,volume;
    printf("Enter value of radius: ");
    scanf("%f", &radius);
    surface_area = 4 * M_PI * pow(radius,2);
    volume = (4.0/3)* M_PI * pow(radius,3);
    printf("Surface area = %f\n", surface_area);
    printf("Volume = %f", volume);
    return;
}
