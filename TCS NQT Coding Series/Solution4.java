import java.util.Scanner;
import java.util.Arrays;

public class Solution4 {

    public static void solve1(int n, int[] arr) {
        Arrays.sort(arr);
    }

    public static void solve2(int n, int[] arr) {
        int[] freq = new int[3];

        for (int a: arr) {
            freq[a]++;
        }

        int i = 0;
        for (int ii = 0; ii < freq[0]; ii++) {
            arr[ii] = 0;
            i++;
        }

        int start = i;
        int end = freq[0] + freq[1] - 1;

        for (int ii = start; ii <= end; ii++) {
            arr[ii] = 1;
            i++;
        }

        start = i;
        end = n-1;

        for (int ii = start; ii <= end; ii++) {
            arr[ii] = 2;
        }
    }

    public static void solve3(int n, int[] arr) {
        int l = 0, r = arr.length-1;
        int i = 0;

        while (i <= r) {
            if (arr[i] == 0) {
                swap(l, i, arr);
                i++;
                l++;
            }

            else if (arr[i] == 2) {
                swap(r, i, arr);
                r--;
            }

            else {
                i++;
            }
        }
    }

    public static void swap(int i, int j, int[] arr) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // solve1(n, arr);
        // solve2(n, arr);
        solve3(n, arr);
        for (int a: arr) {
            System.out.print(a + " ");
        }
        
        sc.close();
    }
    
}
