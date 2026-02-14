#include <stdio.h>
#include <ctype.h>
int main() {
    FILE *f1, *f2;
    char c;
    f1 = fopen("input.txt", "r");
    f2 = fopen("output.txt", "w");
    if(f1 == NULL || f2 == NULL) {
        printf("File error.\n");
        return 1;
    }
    while((c = fgetc(f1)) != EOF)
        fputc(toupper(c), f2);
    fclose(f1);
    fclose(f2);
    return 0;
}
