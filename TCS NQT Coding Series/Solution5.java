import java.util.Scanner;

public class Solution5 {

    public static int solve1(int n, int[] arr) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDominant = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] <= arr[j]) {
                    isDominant = false;
                    break;
                }
            }

            if (isDominant) count++;
        }

        return count;
    }

    public static int solve2(int n, int[] arr) {
        int count = 0, max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve2(n, arr));
        sc.close();
    }
    
}
