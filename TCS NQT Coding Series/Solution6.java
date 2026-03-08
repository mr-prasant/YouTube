import java.util.Scanner;

public class Solution6 {

    public static long solve1(int num) {
        if (num == 0) return 0;

        long price = 1;

        while (num > 0) {
            int dig = num % 10;
            price = price * dig;
            num = num / 10;
        }

        return price;
    }

    public static long solve2(String num) {
        if (num.equals("0")) return 0;

        long price = 1;
        for (char c: num.toCharArray()) {
            int dig = c - '0';
            price = price * dig;
        }

        return price;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        String num = sc.nextLine();
        
        System.out.println(solve2(num));
        sc.close();
    }
}
