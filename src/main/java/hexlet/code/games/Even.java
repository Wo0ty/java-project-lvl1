package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String NAME = "Even";

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_NUMBER][];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i] = getQuestionAndAnswer();
        }

        Engine.start(questionsAndAnswers, DESCRIPTION);
    }

    private static String[] getQuestionAndAnswer() {
        final int maxRandomValue = 15;
        int number = getRandomNumber(0, maxRandomValue);

        String question = Integer.toString(number);
        String answer = getCorrectAnswer(number);

        return new String[] {question, answer};
    }

    private static String getCorrectAnswer(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
