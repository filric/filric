package filric;

import java.util.Scanner;

public class Talspelet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Välkommen till talspelet Tomas :D");
		int quitQuestion;

		do { // loop som bara avslutas om man skriver att quitQuestion är lika med 0

			System.out.println("Vilken svårighetsgrad vill du spela på?");
			System.out.println("Skriv 1 om du vill ha LÄTT(1-100)");
			System.out.println("Skriv 2 om du vill ha SVÅR(1-1000)");
			int easyHard = input.nextInt();
			int random = 0;
			if (easyHard == 1) {
				random = (int) (Math.random() * (100 - 1) + 1);// genererar ett random heltal mellan 1 och 100
			}
			if (easyHard == 2) {
				random = (int) (Math.random() * (1000 - 1) + 1);// genererar ett random heltal mellan 1 och 1000
			}
			for (int chanser = 10; chanser > 0; chanser--) {// en loop som kommer köras max 10 gånger, om du inte gissar rätt. Gissningarna minskar med 1 varje gång den körs
				System.out.println("Gissa på ett tal! Du har " + chanser + " chanser kvar!");
				int gissning = input.nextInt();

				if (gissning > random) {
					System.out.println("Mindre!");
				} else if (gissning < random) {
					System.out.println("Större!");
				} else {
					System.out.println("Rätt svar!");
					chanser = 0;
				}
			}

			System.out.println("Vill du spela igen? För att avsluta skriv 0. För att fortsätta skriv 1.");
			quitQuestion = input.nextInt();
		} while (quitQuestion != 0);

		System.out.println("Tack för att du spelade!");
		input.close();
	}

}
