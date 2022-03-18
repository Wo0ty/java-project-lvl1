package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Even {
    public static final String NAME = "Even";
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

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
        String answer = (number % 2 == 0) ? "yes" : "no";

        Pair task = new Pair(question, answer);
        return task;
    }
}
