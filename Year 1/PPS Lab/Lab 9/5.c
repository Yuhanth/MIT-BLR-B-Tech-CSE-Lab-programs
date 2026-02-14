#include <stdio.h>
struct Product {
    int id;
    char name[20];
    float price;
};
int main() {
    struct Product p[2], *ptr;
    int i;
    ptr = p;
    for(i=0; i<2; i++) {
        printf("Enter id, name, price for product %d: ", i+1);
        scanf("%d %s %f", &(ptr+i)->id, (ptr+i)->name, &(ptr+i)->price);
    }
    for(i=0; i<2; i++) {
        printf("%d %s %.2f\n", (ptr+i)->id, (ptr+i)->name, (ptr+i)->price);
    }
    return 0;
}
