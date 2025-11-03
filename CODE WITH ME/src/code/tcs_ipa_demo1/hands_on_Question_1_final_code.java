import java.util.Scanner;

public class MyClass {
    public static int getAverage(int[] arr, int lower, int upper) {
        long sum = 0;
        int count = 0;
        
        for (int a : arr) {
            if (a > lower && a < upper) {
                sum += a;
                count++;
            }
        }

        double avg = (double) sum / (double) count;
        return (int) avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        System.out.println(getAverage(nums, lower, upper));
    }
}
