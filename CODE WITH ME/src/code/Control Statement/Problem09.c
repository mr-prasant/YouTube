#include <stdio.h>

int main() {
    int nums[10];

    // getting user input
    printf("enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
        int n;
        scanf("%d", &n);

        // only storing the data in the range[1, 50]
        if (n >= 1 && n <= 50) {
            nums[i] = n;
        } else {
            nums[i] = 0;
        }
    }

    // printing the histogram
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < nums[i]; j++) {
            printf("=");
        }
        printf("\n");
    }

    return 0;
}