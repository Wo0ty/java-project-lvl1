package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String askName() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
