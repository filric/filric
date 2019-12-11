package filric;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Välkommen, välj något av dessa alternativ:");
		System.out.println("(1) - New Game");
		System.out.println("(2) - Load Game");
		System.out.println("(3) - New Game");
		System.out.println("(4) - Options");
		System.out.println("(5) - Quit");
		System.out.println();

		choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Spelet laddar...");

			break;
		case 2:
			System.out.println("Välj vilken save du vill köra...");

			break;
		case 3:
			System.out.println("Ljud, Kontroller");

			break;
		case 4:
			System.out.println("Thomas Weis");

			break;
		case 5:
			System.out.println("Spelet avslutas");

			break;

		default:
			System.out.println("Välj en siffra din dummer");
			break;
		}
	}

}
