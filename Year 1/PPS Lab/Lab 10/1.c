#include <stdio.h>
int main() {
    FILE *fp;
    char line[100];
    fp = fopen("file.txt", "r");
    if(fp == NULL) {
        printf("Cannot open file.\n");
        return 1;
    }
    fgets(line, sizeof(line), fp);
    printf("Sentence: %s", line);
    fclose(fp);
    return 0;
}
