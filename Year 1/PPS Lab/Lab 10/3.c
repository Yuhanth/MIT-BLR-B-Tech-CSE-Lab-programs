#include <stdio.h>
int main() {
    FILE *src, *dest;
    char c;
    src = fopen("file1.txt", "r");
    dest = fopen("file2.txt", "w");
    if(src == NULL || dest == NULL) {
        printf("File error.\n");
        return 1;
    }
    while((c = fgetc(src)) != EOF)
        fputc(c, dest);
    fclose(src);
    fclose(dest);
    return 0;
}
