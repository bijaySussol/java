import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] moves = { "r", "p", "s" };
        String computerMove = moves[new Random().nextInt(moves.length)];// Computer random move within the given moves
        // Let create the user input from scanner
        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.print("Enter your move valid moves (r, p, or s):");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        }
        System.out.println("Computer move: " + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("Is a tie!");
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("s")) {
                System.out.println("You win!");
            }
        } else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("You win!");
            } else if (computerMove.equals("s")) {
                System.out.println("You lose!");
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("You win!");
            } else if (computerMove.equals("r")) {
                System.out.println("You loose!");
            }
        }
        scanner.close();
    }
}