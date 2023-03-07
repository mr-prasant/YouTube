#include <stdio.h>

int main() {
    int num1 = 10, num2 = 20; // variables
    printf("before swap: num1 = %d and num2 = %d\n", num1, num2);

    // swap | single line swap
    num2 = num1 + num2 - (num1 = num2);
    printf("after swap:  num1 = %d and num2 = %d\n", num1, num2);

    return 0;
}