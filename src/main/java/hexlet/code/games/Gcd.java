package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final String NAME = "GCD";

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_NUMBER][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = getQuestionAndAnswer();
        }

        Engine.start(questionsAndAnswers, DESCRIPTION);
    }

    private static String[] getQuestionAndAnswer() {
        final int maxRandomValue = 30;

        int num1 = getRandomNumber(1, maxRandomValue);
        int num2 = getRandomNumber(1, maxRandomValue);
        String question = num1 + " " + num2;

        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        String answer = Integer.toString(num1 + num2);
        return new String[] {question, answer};
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
