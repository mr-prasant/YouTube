import java.io.File;
import java.util.Scanner;

public class Holi {
    // all colors
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static String[] colors = {RED, GREEN, YELLOW, BLUE, PURPLE, CYAN};

    public static void printLine(String str) {
        for (int i = 0; i < str.length(); i++) {
            int num = (int)(Math.random() * 10);
            System.out.print(colors[(num % 6)] + str.charAt(i));
            try {
                Thread.sleep(5);
            } catch (Exception e) { }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        File file = new File("holi.txt");
        int temp = 0;
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) printLine(sc.nextLine());
        } catch (Exception e) { }
    }
}