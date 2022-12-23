#include <stdio.h>

int main() {
    int n, digit;
    printf("enter a number and a digit: ");
    scanf("%d %d", &n, &digit);

    int num = n;
    int count = 0;

    while (num > 0) {
        int currDigit = num % 10;

        if (currDigit == digit) {
            count++;
        }

        num /= 10;
    }

    printf("the total number of %d present in %d is: %d", digit, n, count);

    return 0;
}