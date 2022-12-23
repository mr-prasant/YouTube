#include <stdio.h>

int main() {
    // for only get 4-digit number, number >= 1000 and number <= 9999
    for (int num = 1000; num <= 9999; num++) {
        // getting reverse
        int rev = 0;
        int n = num;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        // check for palindrome
        if (rev == num) {
            printf("%d\n", num); // only print palindrome number
        }
    }

    return 0;
}