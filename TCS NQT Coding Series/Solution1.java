import java.util.Scanner;

public class Solution1 {

    public static int[] solve1(int n, int[] arr) {
        int[] res = new int[n];
        int p = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) continue;

            res[p] = arr[i];
            p++;
        }

        return res;
    }
    
    public static void solve2(int n, int[] arr) {
        int i = 0;
        int p = 0;

        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solve2(n, arr);
        for (int a: arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
    
}
