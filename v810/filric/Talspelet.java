package filric;

import java.util.Scanner;

public class Talspelet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("V�lkommen till talspelet Tomas :D");
		int quitQuestion;

		do { // loop som bara avslutas om man skriver att quitQuestion �r lika med 0

			System.out.println("Vilken sv�righetsgrad vill du spela p�?");
			System.out.println("Skriv 1 om du vill ha L�TT(1-100)");
			System.out.println("Skriv 2 om du vill ha SV�R(1-1000)");
			int easyHard = input.nextInt();
			int random = 0;
			if (easyHard == 1) {
				random = (int) (Math.random() * (100 - 1) + 1);// genererar ett random heltal mellan 1 och 100
			}
			if (easyHard == 2) {
				random = (int) (Math.random() * (1000 - 1) + 1);// genererar ett random heltal mellan 1 och 1000
			}
			for (int chanser = 10; chanser > 0; chanser--) {// en loop som kommer k�ras max 10 g�nger, om du inte gissar r�tt. Gissningarna minskar med 1 varje g�ng den k�rs
				System.out.println("Gissa p� ett tal! Du har " + chanser + " chanser kvar!");
				int gissning = input.nextInt();

				if (gissning > random) {
					System.out.println("Mindre!");
				} else if (gissning < random) {
					System.out.println("St�rre!");
				} else {
					System.out.println("R�tt svar!");
					chanser = 0;
				}
			}

			System.out.println("Vill du spela igen? F�r att avsluta skriv 0. F�r att forts�tta skriv 1.");
			quitQuestion = input.nextInt();
		} while (quitQuestion != 0);

		System.out.println("Tack f�r att du spelade!");
		input.close();
	}

}
