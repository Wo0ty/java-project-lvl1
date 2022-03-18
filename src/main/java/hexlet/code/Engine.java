package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_NUMBER = 3;

    public static void start(Pair[] task, String gameDescription) {
        String playerName = Cli.askName();
        System.out.println(gameDescription);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            String question = task[i].getQuestion();
            String correctAnswer = task[i].getAnswer();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
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

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int generateNumber() {
        final int num = 20;
        return getRandomNumber(0, num);
    }

    public static int getRoundsNumber() {
        return ROUNDS_NUMBER;
    }
}
