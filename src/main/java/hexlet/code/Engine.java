package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void start(Pair[] tasks, String gameDescription) {
        String playerName = askName();
        System.out.println(gameDescription);

        Scanner input = new Scanner(System.in);

        for (Pair task: tasks) {
            String question = task.getQuestion();
            String correctAnswer = task.getAnswer();

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

    private static String askName() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
