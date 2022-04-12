package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Calc {
    public static final String NAME = "Calculator";
    public static final String DESCRIPTION = "What is the result of the expression?";

    private static final String[] OPERATIONS = {"+", "-", "*"};

    public static void startGame() {
        RoundData[] tasks = new RoundData[Engine.ROUNDS_NUMBER];

        for (int i = 0; i < tasks.length; i++) {
            int num1 = Utils.getDefaultRandomNumber();
            int num2 = Utils.getDefaultRandomNumber();

            String operation = OPERATIONS[Utils.getRandomNumberUpTo(OPERATIONS.length)];
            String question = num1 + " " + operation + " " + num2;
            String answer = Integer.toString(calculate(num1, num2, operation));

            tasks[i] = new RoundData(question, answer);
        }

        Engine.start(tasks, DESCRIPTION);
    }

    public static int calculate(int num1, int num2, String operation) {
        if (operation.equals("+")) {
            return num1 + num2;
        } else if (operation.equals("-")) {
            return num1 - num2;
        } else if (operation.equals("*")) {
            return num1 * num2;
        }

        return 0;
    }
}

