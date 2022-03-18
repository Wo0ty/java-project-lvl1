package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int selectedGame = input.nextInt();

        switch (selectedGame) {
            case 1:
                Cli.askName();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                Gcd.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            default:
                break;
        }
    }
}
