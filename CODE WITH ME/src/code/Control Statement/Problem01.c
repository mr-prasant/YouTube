#include <stdio.h>

int main() {
    int day, month, year;

    printf("enter a date (dd/mm/yyyy): ");
    scanf("%d/%d/%d", &day, &month, &year);

    if (year >= 1800 && year <= 9999) {
        if (month >= 1 && month <= 12) {
            if (day >= 1 && day <= 31) {
                // for 31 days month
                if (day <= 31 && (month == 1 || month == 3 || month == 5 ||
                                  month == 7 || month == 8 || month == 10 || month == 12)) {
                    printf("valid!");

                // for 30 days month
                } else if (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                    printf("valid!");

                // for feb
                } else if (month == 2) {
                    // leap year
                    if (day <= 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                        printf("valid!");
                    
                    // regular year
                    } else if (day <= 28) {
                        printf("valid!");
                    } else {
                        printf("invalid!");
                    }
                } else {
                    printf("invalid!");
                }
            } else {
                printf("invalid!");
            }
        } else {
            printf("invalid!");
        }
    } else {
        printf("invalid!");
    }

    return 0;
}