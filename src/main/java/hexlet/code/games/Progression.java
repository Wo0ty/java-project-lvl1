package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Progression {
    public static final String NAME = "Progression";
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static final int MIN_NUMBERS_COUNT = 5;
    private static final int MAX_NUMBERS_COUNT = 10;

    private static final String HIDDEN_ELEMENT_SIGN = "..";

    public static void startGame() {
        RoundData[] tasks = new RoundData[Engine.ROUNDS_NUMBER];

        for (int i = 0; i < tasks.length; i++) {
            int numberCount = Utils.getRandomNumberInRange(MIN_NUMBERS_COUNT, MAX_NUMBERS_COUNT);
            int step = Utils.getDefaultRandomNumber() + 1;
            int firstNumber = Utils.getDefaultRandomNumber();
            int indexToHide = Utils.getRandomNumberUpTo(numberCount - 1);

            String[] numbers = new String[numberCount];

            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.toString(firstNumber + step * j);
            }

            String answer = numbers[indexToHide];
            numbers[indexToHide] = HIDDEN_ELEMENT_SIGN;
            String question = String.join(" ", numbers);

            tasks[i] = new RoundData(question, answer);
        }

        Engine.start(tasks, DESCRIPTION);
    }
}
