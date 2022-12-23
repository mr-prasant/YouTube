#include <stdio.h>

int main() {
    int n;
    printf("enter a number: ");
    scanf("%d", &n);

    // variables
    int flag = 0;
    int currFibNum = 0;
    int num1 = 0, num2 = 1;

    while (currFibNum <= n) {
        if (currFibNum == n) {
            flag = 1;
            break;
        }

        currFibNum = num1 + num2;
        num1 = num2;
        num2 = currFibNum;
    }

    if (flag == 1) {
        printf("%d is a fibonacci number!", n);
    } else {
        printf("%d is not a fibonacci number!", n);
    }

    return 0;
}