package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askName() {
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
