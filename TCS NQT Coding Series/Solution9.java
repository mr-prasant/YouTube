import java.util.Scanner;

public class Solution9 {

    public static int calculate(int[] digits, int date, int fine) {
        int unsafe = 0;

        for (int digit: digits) {
            if (digit%2 != date%2) {
                unsafe++;
            }
        }

        return unsafe * fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int date = sc.nextInt();
        int fine = sc.nextInt();

        System.out.println(calculate(digits, date, fine));
        sc.close();
    }
    
}
