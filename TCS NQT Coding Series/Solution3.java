import java.util.Scanner;

public class Solution3 {

    public static int findSundays(String day, int noOfDays) {
        String[] map = {"sun", "sat", "fri", "thu", "wed", "tue", "mon"};

        int mini = 0;
        while (mini < map.length && !map[mini].equals(day)) {
            mini++;
        }

        int sundays = 0;
        noOfDays -= mini;

        if (noOfDays >= 0) {
            sundays = 1 + (noOfDays / 7);
        }

        return sundays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().trim();
        int noOfDays = Integer.parseInt(sc.nextLine().trim());

        System.out.println(findSundays(day, noOfDays));
        sc.close();
    }
    
}
