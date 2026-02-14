#include <stdio.h>
struct Address {
    char street[30];
    char city[20];
    int zip;
};
struct Student {
    char name[20];
    int roll;
    struct Address addr;
};
int main() {
    struct Student s;
    printf("Enter name, roll: ");
    scanf("%s %d", s.name, &s.roll);
    printf("Enter street, city, zip: ");
    scanf("%s %s %d", s.addr.street, s.addr.city, &s.addr.zip);
    printf("Name: %s, Roll: %d\n", s.name, s.roll);
    printf("Address: %s, %s, %d\n", s.addr.street, s.addr.city, s.addr.zip);
    return 0;
}
