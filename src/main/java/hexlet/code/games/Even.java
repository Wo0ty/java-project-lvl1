package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import hexlet.code.Utils;

public class Even {
    public static final String NAME = "Even";
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startGame() {
        Pair[] tasks = new Pair[Utils.ROUNDS_NUMBER];

        for (int i = 0; i < tasks.length; i++) {
            int number = Utils.getDefaultRandomNumber();

            String question = Integer.toString(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            tasks[i] = new Pair(question, answer);
        }

        Engine.start(tasks, DESCRIPTION);
    }
}
