package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String NAME = "Greeting";

    public static void sayHello() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
