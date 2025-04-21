package Day5;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Rock, Paper, Scissors Game!");

		// User input
		System.out.println("Enter your choice:");
		System.out.println("0: Rock, 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();

		// Validate input
		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Invalid choice. Please run the program again and enter 0, 1, or 2.");
			return;
		}

		// Computer's random choice
		int computerChoice = (int) (Math.random() * 3);

		// Display choices
		String[] options = {"Rock", "Paper", "Scissors"};
		System.out.println("You chose: " + options[userChoice]);
		System.out.println("Computer chose: " + options[computerChoice]);

		// Determine winner
		if (userChoice == computerChoice) {
			System.out.println("It's a tie!");
		} else if ((userChoice == 0 && computerChoice == 2) ||
		           (userChoice == 1 && computerChoice == 0) ||
		           (userChoice == 2 && computerChoice == 1)) {
			System.out.println("You win!");
		} else {
			System.out.println("Computer wins!");
		}

		scanner.close();
	}

}
