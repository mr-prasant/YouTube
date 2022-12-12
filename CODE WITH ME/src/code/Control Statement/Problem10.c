#include <stdio.h>

int main() {
    for (int n = 2; n <= 99; n++) {
        int flag = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }

        // checking prime number
        if (flag == 1) {
            printf("%d\n", n); // printing only prime
        }
    }

    return 0;
}