package hexlet.code;

public class Utils {
    public static final int ROUNDS_NUMBER = 3;
    public static final int DEFAULT_MAX_NUMBER = 25;

    public static int getRandomNumberUpTo(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * DEFAULT_MAX_NUMBER);
    }
}
