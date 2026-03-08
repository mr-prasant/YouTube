import java.util.Scanner;

class Solution8 {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int dig = num % 10;
            sum += dig;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int sum = sumOfDigits(n);
        sum = sum * r;

        while (sum/10 > 0) {
           sum = sumOfDigits(sum);
        }

        System.out.println(sum);
        sc.close();
    }
}