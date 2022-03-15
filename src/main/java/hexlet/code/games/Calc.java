package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    static final String DESCRIPTION = "What is the result of the expression?";
    public static final String NAME = "Calc";

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_NUMBER][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = getQuestionAndAnswer();
        }

        Engine.start(questionsAndAnswers, DESCRIPTION);
    }

    private static String[] getQuestionAndAnswer() {
        final int maxRandomValue = 15;
        char[] operations = {'+', '-', '*'};

        int num1 = getRandomNumber(0, maxRandomValue);
        int num2 = getRandomNumber(0, maxRandomValue);
        char operation = operations[getRandomNumber(0, operations.length)];

        String question = num1 + " " + operation + " " + num2;
        String answer = switch (operation) {
            case '-' -> Integer.toString(num1 - num2);
            case '+' -> Integer.toString(num1 + num2);
            case '*' -> Integer.toString(num1 * num2);
            default -> "0";
        };

        return new String[] {question, answer};
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

