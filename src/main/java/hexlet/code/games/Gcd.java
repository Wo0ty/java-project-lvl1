package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Gcd {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final String NAME = "GCD";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        final int maxRandomValue = 30;

        int num1 = Engine.getRandomNumber(1, maxRandomValue);
        int num2 = Engine.getRandomNumber(1, maxRandomValue);
        String question = num1 + " " + num2;

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        String answer = Integer.toString(num1 + num2);
        return new Pair(question, answer);
    }
}
