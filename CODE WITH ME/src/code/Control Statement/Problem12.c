#include <stdio.h>

int main() {
    int n;

    // user input
    printf("enter a number: ");
    scanf("%d", &n);

    // step 01: reverse of number n
    int rev = 0;
    int num = n;
    while (num > 0) {
        rev = (10 * rev) + (num % 10);
        
        // updation
        num /= 10;
    }

    // step 02: comparing the reverse number to original number (n)
    if (n == rev) {
        printf("%d is palindrome!", n);
    } else {
        printf("%d is not a palindrome!", n);
    }

    return 0;
}