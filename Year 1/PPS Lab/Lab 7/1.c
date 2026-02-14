#include <stdio.h>
#include <string.h>

int main() {
    char str[200];
    int i, count = 1;

    printf("Enter a string: ");
    gets(str);

    for (i = 0; i < strlen(str); i++)
        if ((str[i] == ' ' && str[i+1] != ' '))
            count++;

    printf("Number of words: %d\n", count);

    return 0;
}
