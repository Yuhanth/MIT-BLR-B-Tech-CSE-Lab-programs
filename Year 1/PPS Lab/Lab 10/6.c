#include <stdio.h>
int main() {
    FILE *fp;
    char ch;
    int n, count=0, i;
    printf("Enter file name: ");
    char name[50];
    scanf("%s", name);
    printf("Enter n: ");
    scanf("%d", &n);
    fp = fopen(name, "r");
    if(fp == NULL) {
        printf("Cannot open file.\n");
        return 1;
    }
    while(fgetc(fp) != EOF)
        count++;
    if(n > count) n = count;
    fseek(fp, -n, SEEK_END);
    for(i = 0; i < n; i++) {
        ch = fgetc(fp);
        printf("%c", ch);
    }
    fclose(fp);
    return 0;
}
