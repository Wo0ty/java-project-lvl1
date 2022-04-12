package hexlet.code;

public class Utils {
    public static final int DEFAULT_MAX_NUMBER = 20;

    public static int getRandomNumberInRange(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static int getRandomNumberUpTo(int maxNumber) {
        return getRandomNumberInRange(0, maxNumber);
    }

    public static int getDefaultRandomNumber() {
        return getRandomNumberInRange(0, DEFAULT_MAX_NUMBER);
    }
}
