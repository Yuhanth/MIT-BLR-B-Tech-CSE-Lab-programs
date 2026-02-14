#include <stdio.h>
int main() {
    FILE *fp;
    char line[100];
    fp = fopen("file.txt", "a");
    if(fp == NULL) {
        printf("Cannot open file.\n");
        return 1;
    }
    printf("Enter line: ");
    gets(line);
    fputs(line, fp);
    fclose(fp);
    return 0;
}
