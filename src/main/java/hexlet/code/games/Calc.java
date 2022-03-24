package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;
import hexlet.code.Utils;

public class Calc {
    public static final String NAME = "Calculator";
    static final String DESCRIPTION = "What is the result of the expression?";

    public static void startGame() {
        Pair[] task = new Pair[Engine.getRoundsNumber()];

        for (int i = 0; i < task.length; i++) {
            task[i] = getQuestionAndAnswer();
        }

        Engine.start(task, DESCRIPTION);
    }

    private static Pair getQuestionAndAnswer() {
        char[] operations = {'+', '-', '*'};
        final int maxNumber = 20;

        int num1 = Utils.getRandomNumberUpTo(maxNumber);
        int num2 = Utils.getRandomNumberUpTo(maxNumber);
        char operation = operations[Utils.getRandomNumberUpTo(operations.length)];

        String question = num1 + " " + operation + " " + num2;
        String answer = switch (operation) {
            case '-' -> Integer.toString(num1 - num2);
            case '+' -> Integer.toString(num1 + num2);
            case '*' -> Integer.toString(num1 * num2);
            default -> "0";
        };

        Pair task = new Pair(question, answer);
        return task;
    }
}

