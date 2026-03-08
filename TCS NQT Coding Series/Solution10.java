import java.util.*;

public class Solution10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n]; 
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int a: temp) {
            if (!map.containsKey(a)) {
                map.put(a, rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        for (int a: arr) {
            System.out.print(a + " ");
        }
        
        System.out.println();
        sc.close();
    }
    
}
