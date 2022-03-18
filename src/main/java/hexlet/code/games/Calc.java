package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public class Calc {
    public static final String NAME = "Calc";
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

        int num1 = Engine.generateNumber();
        int num2 = Engine.generateNumber();
        char operation = operations[Engine.getRandomNumber(0, operations.length)];

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

