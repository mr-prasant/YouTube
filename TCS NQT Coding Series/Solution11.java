import java.util.Scanner;

public class Solution11 {

    public static String solve(int key, int n, int[][] mat) {
        int r = 0, c = n-1;

        while (c > -1 && r < n) {
            if (mat[r][c] == key) 
                return String.format("Fount at (%d,%d)", r, c);
            else {
                if (mat[r][c] > key) c--;
                else r++;
            }
        }

        return "Element not found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int key = sc.nextInt();
        System.out.println(solve(key, n, mat));

        sc.close();
    }
    
}
