#include <stdio.h>

int main() {
    int n = 0;
    printf("enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++) {
        printf("sqaure of %d is: %d\n", i, (i * i));
    }

    return 0;
}