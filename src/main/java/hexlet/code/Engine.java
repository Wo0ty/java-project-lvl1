package hexlet.code;

public class Engine {
    public static void start(Pair[] tasks, String gameDescription) {
        System.out.println(gameDescription);

        String playerName = askName();

        for (Pair task: tasks) {
            String question = task.getQuestion();
            String correctAnswer = task.getAnswer();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = Utils.getDataFromUser();

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

        String userName = Utils.getDataFromUser();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
