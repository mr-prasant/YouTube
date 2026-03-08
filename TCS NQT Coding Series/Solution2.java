import java.util.Scanner;

public class Solution2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // StringBuilder binary = new StringBuilder();

        // while (num > 0) {
        //     int bit = num & 1;

        //     if (bit == 0) binary.append('1');
        //     else binary.append('0');

        //     num = num >> 1;
        // }

        // binary.reverse();

        // int result = Integer.parseInt(binary.toString(), 2);
        // System.out.println(result);

        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);

        // 0 -> t
        binary = binary.replace('0', 't');

        // 1 -> 0
        binary = binary.replace('1', '0');

        // t -> 1
        binary = binary.replace('t', '1');

        int result = Integer.parseInt(binary, 2);
        System.out.println(result);
        sc.close();
    }
}
