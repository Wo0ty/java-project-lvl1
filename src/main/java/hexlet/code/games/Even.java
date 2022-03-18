package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Even {

    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String NAME = "Even";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        final int maxRandomValue = 15;
        int number = Engine.getRandomNumber(0, maxRandomValue);

        String question = Integer.toString(number);
        String answer = (number % 2 == 0) ? "yes" : "no";

        return new Pair(question, answer);
    }
}
