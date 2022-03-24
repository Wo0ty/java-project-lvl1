package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import hexlet.code.Utils;

public class Gcd {
    public static final String NAME = "GCD";
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        final int maxNumber = 20;
        int num1 = Utils.getRandomNumberUpTo(maxNumber) + 1;
        int num2 = Utils.getRandomNumberUpTo(maxNumber) + 1;
        String question = num1 + " " + num2;

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        String answer = Integer.toString(num1 + num2);

        Pair task = new Pair(question, answer);
        return task;
    }
}
