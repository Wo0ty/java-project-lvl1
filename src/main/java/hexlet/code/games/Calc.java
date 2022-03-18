package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Calc {

    static final String DESCRIPTION = "What is the result of the expression?";
    public static final String NAME = "Calc";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        final int maxRandomValue = 15;
        char[] operations = {'+', '-', '*'};

        int num1 = Engine.getRandomNumber(0, maxRandomValue);
        int num2 = Engine.getRandomNumber(0, maxRandomValue);
        char operation = operations[Engine.getRandomNumber(0, operations.length)];

        String question = num1 + " " + operation + " " + num2;
        String answer = switch (operation) {
            case '-' -> Integer.toString(num1 - num2);
            case '+' -> Integer.toString(num1 + num2);
            case '*' -> Integer.toString(num1 * num2);
            default -> "0";
        };

        return new Pair(question, answer);
    }
}

