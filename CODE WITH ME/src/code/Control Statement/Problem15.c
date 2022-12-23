#include <stdio.h>

int main() {
    int n;
    printf("enter a number: ");
    scanf("%d", &n);

    int num = n;
    int digit = 0;
    while (num > 0) {
        digit++;
        num /= 10;
    }

    printf("the total number of digits of %d is: %d", n, digit);

    return 0;
}