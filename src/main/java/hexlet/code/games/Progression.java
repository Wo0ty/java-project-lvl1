package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Progression {
    
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static final String NAME = "Progression";


    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        return new Pair("", "");
    }
}
