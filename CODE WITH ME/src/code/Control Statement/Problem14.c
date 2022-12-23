#include <stdio.h>

int main() {
    // get the user input
    int n = 0;
    printf("enter a number: ");
    scanf("%d", &n);

    // variables
    int fib = -1;
    int num1 = 0, num2 = 1;

    // if n <= 2
    if (n >= 1) {
        fib = num1;
        printf("%d ", fib);
    } 
    if (n >= 2) {
        fib = num2;
        printf("%d ", fib);
    }

    // for n > 2
    int i = 2;
    while (i++ < n) {
        fib = num1 + num2;
        printf("%d ", fib);

        // updation of num1 and num2
        num1 = num2;
        num2 = fib;
    }

    return 0;
}