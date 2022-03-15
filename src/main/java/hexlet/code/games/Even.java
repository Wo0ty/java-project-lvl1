package hexlet.code.games;

import java.util.Scanner;

public class Even {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int MAX_RANDOM_VALUE = 15;

    public static void startGame() {
        String playerName = hexlet.code.Cli.askName();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = getRandomNumber(0, MAX_RANDOM_VALUE);
            System.out.println("Question: " + number);

            String correctAnswer = getCorrectAnswer(number);
            System.out.print("Your answer: ");

            Scanner input = new Scanner(System.in);
            String answer = input.next();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(.  Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private static String getCorrectAnswer(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }
}
