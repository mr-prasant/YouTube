#include <stdio.h>

int main() {
    for (int i = 100; i < 333; i++) {
        int flag = 0;

        // get the three numbers
        int n = i;
        int d = 2 * i;
        int t = 3 * i;
        int nums[] = {n, d, t};

        // for each digits of each number
        int digits[9];
        int k = 0;

        // for checking each number for the repeating digit
        for (int j = 0; j < 3; j++) {
            int d1 = nums[j] % 10;
            int d2 = (nums[j] / 10) % 10;
            int d3 = (nums[j] / 100) % 10;

            if (d1 == d2 || d1 == d3 || d2 == d3) {
                flag = 0;
                break;
            } else {
                flag = 1;
                // storing all the digits in the array digits
                digits[k++] = d3;
                digits[k++] = d2;
                digits[k++] = d1;
            }
        }

        if (flag == 0) {
            continue;
        }

        // for checking the repeatation of digits in the array
        for (int a = 0; a < 8; a++) {
            for (int b = a + 1; b < 9; b++) {
                if (digits[a] == digits[b]) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 0) {
                break;
            }
        }

        if (flag == 0) {
            continue;
        }

        // now we got the three numbers having the unique digits to the other digits of each number
        printf ("%d %d %d\n", n, d, t);
    }

    return 0;
}