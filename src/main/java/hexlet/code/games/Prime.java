package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Prime {
    public static final String NAME = "Prime";
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        RoundData[] tasks = new RoundData[Engine.ROUNDS_NUMBER];

        for (int i = 0; i < tasks.length; i++) {
            int number = Utils.getDefaultRandomNumber();

            String question = Integer.toString(number);
            String answer = isPrime(number) ? "yes" : "no";

            tasks[i] = new RoundData(question, answer);
        }

        Engine.start(tasks, DESCRIPTION);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
