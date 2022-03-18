package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import java.util.Arrays;

public class Progression {
    public static final String NAME = "Progression";
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static final int MIN_NUMBERS_COUNT = 5;
    private static final int MAX_NUMBERS_COUNT = 10;

    private static final String HIDDEN_ELEMENT_SIGN = "..";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {

        int numberCount = Engine.getRandomNumber(MIN_NUMBERS_COUNT, MAX_NUMBERS_COUNT);
        int step = Engine.generateNumber() + 1;
        int firstNumber = Engine.generateNumber();
        int indexToHide = Engine.getRandomNumber(0, numberCount - 1);

        String[] numbers = new String[numberCount];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.toString(firstNumber + step * i);
        }

        String answer = numbers[indexToHide];
        numbers[indexToHide] = HIDDEN_ELEMENT_SIGN;
        String question = String.join(" ", numbers);

        Pair task = new Pair(question, answer);
        return task;
    }
}
