#include <stdio.h>

int main() {
    int n, key, found = 0;
    printf("Enter number of students: ");
    scanf("%d", &n);

    int students[n];
    printf("Enter roll numbers:\n");
    for (int i = 0; i < n; i++) scanf("%d", &students[i]);

    printf("Enter roll number to search: ");
    scanf("%d", &key);

    for (int i = 0; i < n; i++) {
        if (students[i] == key) {
            printf("Roll number %d found at position %d\n", key, i+1);
            found = 1;
            break;
        }
    }

    if (!found) printf("Roll number %d not found\n", key);

    return 0;
}
