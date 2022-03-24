package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Prime {
    public static final String NAME = "Prime";

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        int number = Engine.generateNumber();

        String question = Integer.toString(number);
        String answer = isPrime(number) ? YES_ANSWER : NO_ANSWER;

        Pair task = new Pair(question, answer);
        return task;
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
