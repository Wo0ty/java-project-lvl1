package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gameNames = {"Exit", "Greeting", "Even", "calculator", "GCD", "Progression"};
        int countGames = gameNames.length;

        for (int i = 1; i < countGames; i++) {
            System.out.println(i + " - " + gameNames[i]);
        }
        System.out.println("0 - " + gameNames[0]);

        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int selectedGame = input.nextInt();

        switch (gameNames[selectedGame]) {
            case "Greeting":
                Cli.askName();
                break;
            case "Even":
                Even.startGame();
                break;
            case Calc.NAME:
                Calc.startGame();
                break;
            case Gcd.NAME:
                Gcd.startGame();
                break;
            case Progression.NAME:
                Progression.startGame();
                break;
            default:
                break;
        }
    }
}
