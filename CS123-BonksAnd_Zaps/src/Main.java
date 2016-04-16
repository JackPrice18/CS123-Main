import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner scan;
	private static int GRID_SIZE_X = 20;
	private static int GRID_SIZE_Y = 20;
	private static int GAME_MAX_LENGTH = 60;
	private static int WAIT_TIME = 1000;

	public Main() {
		scan = new Scanner(System.in);
	}

	private void start() throws IOException {
		setPram();
		runMenu();
	}

	private static void setPram() {
		boolean done = false;
		String answer;

			printSetPram();

			do {
				if (done == true) {
					return;
				}
				answer = scan.next().toUpperCase();
				switch (answer) {
				case "C":
					changeSettings();
					done = true;
					break;

				case "N":

					break;

				default:
					System.out.println("\n" + answer + " - Is an invalid entry please try again \n");
				}
			} while (done || !answer.equals("N"));

		
		// GridWorld gridWorld = new GridWorld(GRID_SIZE_X, GRID_SIZE_Y,
		// GAME_MAX_LENGTH, WAIT_TIME);
	}

	/**
	 * 
	 */
	private static void printSetPram() {
		System.out.println("===========================");
		System.out.println("Welcome to Bonks and Zaps!");
		System.out.println("===========================\n");

		System.out.println("Here you have the chance to change the setting of the game if you wish.\n"
				+ "If you want to change the settings then please press C if not press N and the game will load with "
				+ "the default setting of :\n ");

		System.out.println("- The world size is 20x20.");
		System.out.println("- The game cycles every second.");
		System.out.println("- The lenght of the game is 60 seconds.\n");

		System.out.println("Please press C to change the settings or N to keep them as default.");
	}

	private static void changeSettings() {
		boolean valid;

		System.out.println("\n=====================");
		System.out.println("Settings Change Menu");
		System.out.println("=====================\n");

		System.out.println("The settings to change:\n");

		do {
			valid = false;
			System.out.println("Please enter the world size you want - Currently set at 20 (20x20)");
			try {
				int change = scan.nextInt();
				GRID_SIZE_X = change;
				GRID_SIZE_Y = change;
				System.out.println("The world size has been set to " + GRID_SIZE_Y + " (" + GRID_SIZE_Y + "x"
						+ GRID_SIZE_X + ")\n");
				valid = true;
			} catch (InputMismatchException e) {
				System.err.println("Not a number, please try again. \n");
				scan.next();
			}
		} while (!valid);

		do {
			valid = false;
			System.out.println("Please enter how long you want the gmae to run seconds - Currently set at 60");
			try {
				int change = scan.nextInt();
				GAME_MAX_LENGTH = change;
				System.out.println("The game length has been set to " + GAME_MAX_LENGTH + " seconds\n");
				valid = true;
			} catch (InputMismatchException e) {
				System.err.println("Not a number, please try again. \n");
				scan.next();
			}
		} while (!valid);

		do {
			valid = false;
			System.out.println(
					"Please enter how long you want a cycle to be in milliseconds - Currently set at 1000 (1 second)");
			try {
				int change = scan.nextInt();
				WAIT_TIME = change;
				System.out.println("The cycle length has been set to " + WAIT_TIME + " milliseconds ("
						+ WAIT_TIME / 1000 + " seconds)\n");
				valid = true;
			} catch (InputMismatchException e) {
				System.err.println("Not a number, please try again. \n");
				scan.next();
			}
		} while (!valid);

		System.out.println("Settings have been changed! The game will start now\n\n");
		
		return;
	}

	private void runMenu() throws IOException {
		String answer;
		do {
			printMenu();
			answer = scan.next().toUpperCase();
			// System.out.println(answer);

			switch (answer) {
			case "P":
				// thing
				break;

			case "Q":
				quitPrint();
				break;

			default:
				System.out.println("\n" + answer + " - Is an invalid entry please try again \n");
			}

		} while (!answer.equals("Q"));
	}

	/*
	 * private void options() { String answer; do { printOptions(); answer =
	 * scan.next().toUpperCase();
	 * 
	 * switch (answer) { case "2": //thing break;
	 * 
	 * case "1": //thing break;
	 * 
	 * case "B":
	 * 
	 * break;
	 * 
	 * default: System.out.println("\n" + answer +
	 * " - Is an invalid entry please try again \n"); }
	 * 
	 * } while (!answer.equals("B"));
	 * 
	 * }
	 */

	/*
	 * private void printOptions() {
	 * System.out.println("\n\n======================");
	 * System.out.println("Options");
	 * System.out.println("======================\n"); System.out.println(
	 * "1 - Do something"); System.out.println("2 - Do something");
	 * System.out.println("3 - Do Something"); System.out.println(
	 * "4 - Do something\n"); System.out.println("B - Back to menu"); }
	 */

	private void quitPrint() {

		System.out.println("\n====================");
		System.out.println("Thanks for playing!");
		System.out.println("====================");
	}

	private void printMenu() {
		System.out.println("\n==========================");
		System.out.println("Welcome to Bonks and Zaps!");
		System.out.println("==========================\n");
		System.out.println("P - Play game");
		System.out.println("Q - Quit");
	}

	public static void main(String[] args) throws IOException {

		Main app = new Main();
		app.start();

	}

}
