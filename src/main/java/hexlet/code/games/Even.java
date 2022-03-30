package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import hexlet.code.Utils;

public class Even {
    public static final String NAME = "Even";
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startGame() {
        Pair[] task = new Pair[Utils.ROUNDS_NUMBER];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        final int maxNumber = 20;
        int number = Utils.getRandomNumber();

        String question = Integer.toString(number);
        String answer = (number % 2 == 0) ? "yes" : "no";

        Pair task = new Pair(question, answer);
        return task;
    }
}
