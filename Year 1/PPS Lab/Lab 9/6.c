#include <stdio.h>
struct Player {
    char name[20];
    char team[20];
    float avg;
};
int main() {
    struct Player p[3], temp;
    int i, j;
    for(i=0;i<3;i++) {
        printf("Enter name, team, avg for player %d: ", i+1);
        scanf("%s %s %f", p[i].name, p[i].team, &p[i].avg);
    }
    for(i=0;i<2;i++) {
        for(j=i+1;j<3;j++) {
            if(p[i].avg < p[j].avg) {
                temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }
    for(i=0;i<3;i++) {
        printf("%s %s %.2f\n", p[i].name, p[i].team, p[i].avg);
    }
    return 0;
}
