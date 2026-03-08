import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = Integer.parseInt(sc.nextLine());

        int max = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i%l == 0) {
                max = Math.max(max, count);
                count = 0;
            }

            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        max = Math.max(max, count);
        System.out.println(max + " " + count);
        sc.close();
    }
    
}