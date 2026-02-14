#include <stdio.h>
#include <string.h>

int main() {
    char s[200];
    printf("Enter a string: ");
    gets(s);

    for (int i=0; i < strlen(s); i++) {
        if (s[i] >= 'a' && s[i] <= 'z')
            s[i] -= 32;
        else if(s[i] >= 'A' && s[i] <= 'Z')
            s[i]+= 32;
    }
    printf("Toggled: %s",s);
    return 0;
}
