#include <stdio.h>

int main() {
    int n = 0;
    printf("enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        int cube = (i * i * i);
        if (cube % 3 == 0) {
            printf("cube of %d is: %d\n", i, cube);
        }
    }

    return 0;
}