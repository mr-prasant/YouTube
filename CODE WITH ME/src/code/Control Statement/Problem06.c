#include <stdio.h>

int main() {
    int num1, num2;
    int lcm, hcf = 0;

    // getting the user input
    printf("enter two numbers: ");
    scanf("%d%d", &num1, &num2);

    // store the smaller value in num1
    if (num1 > num2) {
        int t = num1;
        num1 = num2;
        num2 = t;
    }

    // extra variables
    int a = num1;
    int b = num2;

    // finding the hcf first
    while (hcf == 0) {
        int remainder = num2 % num1;

        if (remainder == 0) {
            hcf = num1;
            break;
        }

        num2 = num1;
        num1 = remainder;
    }

    // getting the lcm
    lcm = (a * b) / hcf;

    printf("HCF: %d\nLCM: %d", hcf, lcm);

    return 0;
}