#include <stdio.h>

int main() {
    int large = 0;

    // taking user input
    printf("enter 10 numbers: ");

    for (int i = 0; i < 10; i++) {
        int num;

        // getting the input in the variable num each time
        scanf("%d", &num);

        // comparision with large each time, for each new input
        if (i == 0) {
            // initially store the 1st number in large
            large = num;
        } else {
            // comarision and store the max value in large
            large = (num > large) ? num : large;
        }

    }

    printf("the largest number is: %d", large);
    

    return 0;
}