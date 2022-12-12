#include <stdio.h>

int main() {
    int num1, num2;
    int product = 0;

    // user input
    printf("enter two numbers: ");
    scanf("%d%d", &num1, &num2);

    // calculation
    while (num1 > 0) {
        // updation
        num1 /= 2;

        num2 *= 2;
        product += (num1 % 2 != 0) ? num2 : 0;
    }

    printf("product: %d", product);

    return 0;
}