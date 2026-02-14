#include <stdio.h>
int main() {
    FILE *fp;
    char c;
    int chars=0, words=0, lines=0, inWord=0;
    fp = fopen("file.txt", "r");
    if(fp == NULL) {
        printf("Cannot open file.\n");
        return 1;
    }
    while((c = fgetc(fp)) != EOF) {
        chars++;
        if(c == '\n')
            lines++;
        if(c == ' ' || c == '\n' || c == '\t')
            inWord = 0;
        else if(inWord == 0) {
            inWord = 1; words++;
        }
    }
    printf("Characters: %d Words: %d Lines: %d\n", chars, words, lines);
    fclose(fp);
    return 0;
}
