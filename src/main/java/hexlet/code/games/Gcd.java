package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Gcd {
    public static final String NAME = "GCD";
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        RoundData[] tasks = new RoundData[Engine.ROUNDS_NUMBER];

        for (int i = 0; i < tasks.length; i++) {
            int num1 = Utils.getDefaultRandomNumber() + 1;
            int num2 = Utils.getDefaultRandomNumber() + 1;

            String question = num1 + " " + num2;
            String answer = Integer.toString(findGCD(num1, num2));

            tasks[i] = new RoundData(question, answer);
        }

        Engine.start(tasks, DESCRIPTION);
    }

    private static int findGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }

        return num1 + num2;
    }
}
