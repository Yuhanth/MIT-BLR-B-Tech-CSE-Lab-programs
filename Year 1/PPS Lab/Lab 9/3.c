#include <stdio.h>
struct Student {
    char name[20];
    int roll;
    int marks[3];
};

int main() {
    struct Student s[5];
    int i, j, total; float avg;
    for(i=0; i<5; i++) {
        printf("Enter name, roll, marks(3) of student %d: ", i+1);
        scanf("%s %d %d %d %d", s[i].name, &s[i].roll, &s[i].marks[0], &s[i].marks[1], &s[i].marks[2]);
    }
    for(i=0; i<5; i++) {
        total = 0;
        for(j=0;j<3;j++)
            total += s[i].marks[j];
        avg = total/3.0;
        printf("%s %d Total=%d Avg=%.2f\n", s[i].name, s[i].roll, total, avg);
    }
    return 0;
}
