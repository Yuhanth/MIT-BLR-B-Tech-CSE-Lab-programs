#include <stdio.h>

int CornerSum(int rows, int cols, int matrix[rows][cols]) {
    if (rows == 0 || cols == 0)
        return 0;

    int sum = 0;

    sum += matrix[0][0];
    sum += matrix[0][cols - 1];
    sum += matrix[rows - 1][0];
    sum += matrix[rows - 1][cols - 1];

    return sum;
}

int main() {
    int rows, cols;
    printf("Enter number of rows: ");
    scanf("%d", &rows);
    printf("Enter number of columns: ");
    scanf("%d", &cols);

    int matrix[rows][cols];

    printf("Enter the elements of the matrix:\n");
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            scanf("%d", &matrix[i][j]);

    int sum = CornerSum(rows, cols, matrix);
    printf("Sum of corner elements = %d\n", sum);

    return 0;
}
