#include <stdio.h>
#include <string.h>

int main() {
    char str[200], word[50], temp[200], part[50];
    int i = 0, j = 0, k = 0;

    printf("Enter a sentence: ");
    gets(str);

    printf("Enter the word to delete: ");
    gets(word);

    temp[0] = '\0';
    while (str[i] != '\0') {
        j = 0;
        while (str[i] != ' ' && str[i] != '\0') {
            part[j++] = str[i++];
        }
        part[j] = '\0';

        // If current word is not the one to delete, add it to temp
        if (strcmp(part, word) != 0) {
            if (strlen(temp) > 0)
                strcat(temp, " ");
            strcat(temp, part);
        }

        // Skip any spaces
        if (str[i] == ' ')
            i++;
    }

    printf("\nSentence after deletion:\n");
    puts(temp);

    return 0;
}
