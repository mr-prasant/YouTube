#include <stdio.h>

int main() {
    int n;

    // user input
    printf("enter a number to reverse: ");
    scanf("%d", &n);

    int reverse = 0;
    while (n > 0) {
        int unitDigit = n % 10;
        reverse = (reverse * 10) + unitDigit;
        
        // updation
        n = n / 10;
    }

    printf("reversed number: %d", reverse);

    return 0;
}