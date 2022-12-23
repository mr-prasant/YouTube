#include <stdio.h>

int main() {
    int x = 0, y = 0;
    printf("enter two numbers: ");
    scanf("%d %d", &x, &y);

    int pow = 1;
    int temp = y;
    while (temp-- > 0) {
        pow *= x;
    }

    printf("%d raised %d is: %d", x, y, pow);

    return 0;
}