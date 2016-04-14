import java.io.IOException;
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
		
		String answer;
		
		System.out.println("===========================");
		System.out.println("Welcome to Bonks and Zaps!");
		System.out.println("===========================\n");
		
		System.out.println("Here you have the chance to change the setting of the game if you wish.\n"
				+ "If you want to change the settings then please press C if not press N and the game will load with "
				+ "the default setting of :\n ");
		
		System.out.println("- The world size is 20x20.");
		System.out.println("- The game cycles every second.");
		System.out.println("- The lenght of the game is 60 seconds.\n");
		
		System.out.println("Please press C to chanfe the settings or N to keep them as default.");
		
		do{
			answer = scan.next().toUpperCase();
			switch(answer){
			case "C":
				//changeSettings();
				break;
			
			case "N":
				
				break;
				
			default:
				System.out.println("\n" + answer + " - Is an invalid entry please try again \n");
		}
		}while(!answer.equals("N"));
		
		
		GridWorld gridWorld = new GridWorld(GRID_SIZE_X, GRID_SIZE_Y, GAME_MAX_LENGTH, WAIT_TIME);
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

			case "O":
				// options();
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
		System.out.println("======================");
		System.out.println("Welcome to !");
		System.out.println("======================\n");
		System.out.println("P - Play game");
		System.out.println("O - Options");
		System.out.println("Q - Quit");
	}

	public static void main(String[] args) throws IOException {

		Main app = new Main();
		app.start();

	}

}
