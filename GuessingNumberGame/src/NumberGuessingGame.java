import java.util.Random;
import java.util.Scanner;

/**
 * Implementing the guessing game no limitation on retries, but can quit the
 * game by typing "q" from the console (case sensitive) else enjoy the game!
 * 
 **/
public class NumberGuessingGame {

	public static void main(String[] args) {

		Random RANDOM_NUMBER_INPUT = new Random();
		int RANDOM_NUMBER = 0;

		while (true) {

			Scanner USER_INPUT = new Scanner(System.in);

			System.out.println("Enter the number greater than 0 and within that range of number, guess the number!");
			int playerRange = USER_INPUT.nextInt();

			if (playerRange <= 0) {
				System.out.println("Please enter the number > 0");
			} else {

				RANDOM_NUMBER = playerRange;
				System.out.println("Your number is between the range of 1 - : " + RANDOM_NUMBER);
				Scanner USER_GUESSES = new Scanner(System.in); // purpose

				int playerAttemptsCounter = 0;
				int RANDOM_NUMBER_TO_GUESS = RANDOM_NUMBER_INPUT.nextInt(RANDOM_NUMBER) + 1;
				System.out.println("To Guess is: " + RANDOM_NUMBER_TO_GUESS); // For debug purpose
				char quitTheGame = 'a';

				while (true) {
					System.out.println("Your guess?");

					if (USER_GUESSES.hasNextInt()) {

						int PLAYER_GUESS = USER_GUESSES.nextInt();
						playerAttemptsCounter++;

						if (RANDOM_NUMBER_TO_GUESS == PLAYER_GUESS) {
							System.out
									.println("What a player, You won!! after " + playerAttemptsCounter + " attempts!");
							break; // Get out of loop as there is no limitation on attempts so
						} else if (RANDOM_NUMBER_TO_GUESS > PLAYER_GUESS) {
							System.out.println("The number is higer, Guess again");
						} else if (PLAYER_GUESS > RANDOM_NUMBER) {
							System.out.println("Out of bound.");
						} else {
							System.out.println("The number is lower, Guess again");
						}
					} else {
						quitTheGame = USER_GUESSES.next().charAt(0);

						if (quitTheGame == 'q') {
							System.out.println("Sorry to see you go!");
							break;
						}
					}

				}
				USER_GUESSES.close();
			}
			USER_INPUT.close();
			break;
		}
	}
}
