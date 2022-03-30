package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static final int ROUNDS_NUMBER = 3;
    public static final int DEFAULT_MAX_NUMBER = 20;

    public static int getRandomNumberUpTo(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    public static int getDefaultRandomNumber() {
        return (int) (Math.random() * DEFAULT_MAX_NUMBER);
    }

    public static int getRandomNumberInRange(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static String getDataFromUser() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
