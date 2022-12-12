#include <stdio.h>

int main() {
    int day1 = 0, month1 = 0, year1 = 0;
    int day2 = 0, month2 = 0, year2 = 0;

    int day = 0, month = 0, year = 0;

    printf("please enter the dates in the format dd/mm/yyyy!");

    // from
    printf("\nenter the date from: ");
    scanf("%d/%d/%d", &day1, &month1, &year1);

    // to
    printf("enter the date to: ");
    scanf("%d/%d/%d", &day2, &month2, &year2);

    // year calculation
    if (year2 >= year1) {
        if (year2 == year1) {
            if (month2 >= month1) {
                if (month2 == month1 && day2 < day1) {
                    printf("something wrong!");
                    return 0;
                }
            } else {
                printf("something wrong!");
                return 0;
            }
        }

        // code
        if (day2 < day1) {
            month2--;

            if (month2 == 0) {
                month2 = 12;
                year2--;
            }
            
            // for the months of 31 days
            if (month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 8 || month2 == 10 || month2 == 12) {
                day2 += 31;
            }

            // for the months of 30 days
            else if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
                day2 += 30;
            }

            // for feb
            else if (month2 == 2) {
                // checking the leap year
                day2 += (year2 % 400 == 0 || (year2 % 4 == 0 && year2 % 100 != 0)) ? 29 : 28;
            }
        }

        // for months
        if (month2 < month1) {
            year2--;
            month2 += 12;
        }

        // calculations
        day = day2 - day1;
        month = month2 - month1;
        year = year2 - year1;

        printf("\nthe difference between the dates is: %d days, %d months and %d years!", day, month, year);

    } else {
        printf("something wrong!");
        return 0;
    }

    return 0;
}