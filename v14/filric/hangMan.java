package filric;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class hangMan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("V�lkommen till H�nga Gubbe");
		System.out.println();
		System.out.println("Spelet kommer g� till s�h�r: ");
		System.out.println("Du v�ljer en sv�righetsgrad beroende p� hur l�nga ord du vill gissa p�");
		System.out.println("Eftersom l�ngre ord �r l�ttare att gissa en bokstav r�tt p� s� �r 10-20 bokst�ver ");
		System.out.println("klassad som l�tt. Detta betyder att ord med 1-9 bokst�ver klassas som sv�rare.");
		System.out.println("PS! Alla ord kommer vara p� svenska och med sm� bokst�ver!");
		System.out.println();

		String[] easy = new String[5];
		easy[0] = "nostalgisk";
		easy[1] = "bronkopneumoni";// Orsakad av virus, bakterier eller luftv�gsinfektion
		easy[2] = "jobbskatteavdrag";
		easy[3] = "peritonsillit"; // �ven kallad halsb�ld
		easy[4] = "mycoplasmapneumoni";// Orsakas av en bakterie som inte har en cellv�gg

		String[] hard = new String[5];
		hard[0] = "afasi"; // Afasi inneb�r att ha spr�kliga sv�righeter efter en hj�rnskada
		hard[1] = "miserabel";
		hard[2] = "sarv";// En fisk
		hard[3] = "autism";
		hard[4] = "id";// Ocks� en fisk

		int avsluta = 0;
		int position = 0;
		String ordet = "";
		char[] aktuellStatus;
		// deklarerar och initzierar variabler

		do {
			System.out.println("Vilken sv�righetsgrad vill du spela p�?");
			System.out.println("Skriv 1 om du vill ha l�tt");
			System.out.println("Skriv 2 om du vill ha sv�rt");
			int easyHard = input.nextInt();
			input.nextLine();
			if (easyHard == 1) {
				position = (int) (Math.random() * easy.length);
				ordet = easy[position];
			}
			if (easyHard == 2) {
				position = (int) (Math.random() * hard.length);
				ordet = hard[position];
			}

			aktuellStatus = new char[ordet.length()];
			for (int i = 0; i < aktuellStatus.length; i++) {// tilldelar alla tecken i aktuellStatussstr�ngen en _
				aktuellStatus[i] = '_';
			}
			for (int chanser = 10; chanser > 0; chanser--) {// en loop som tar bort en chans varje g�ng du svarar fel

				System.out.println("H�r ser du ordet du ska gissa p�: ");

				for (int i = 0; i < aktuellStatus.length; i++) {
					System.out.print(aktuellStatus[i]);
				}
				System.out.println();
				System.out.println("Gissa p� en bokstav! Du har " + chanser + " chanser kvar!");
				String gissning = input.nextLine();
				

				if (gissning.length() != 1) {
					System.out.println("Skriv en bokstav i taget tack");
					chanser++;
				}

				if (gissning.length() == 1) {

					if (ordet.contains(gissning)) {

						chanser++;
						if (ordet.contains(gissning)) {

							int index = ordet.indexOf(gissning);// tar reda p� vilken plats tecknet finns p�

							while (index >= 0) {// medans index �r st�rre eller lika med 0 ska aktuellStatus fyllas med
												// den gissade bokstaven
								aktuellStatus[index] = gissning.charAt(0);
								index = ordet.indexOf(gissning, index + 1);
							}
							if (ordet.contentEquals(new String(aktuellStatus))) {// kollar om aktuellStatus �r samma som
																					// ordet
								System.out.println("GRATTIS DU HAR LYCKATS");
								System.out.println("Ordet var " + ordet);
								chanser = 0;
							} else {
								System.out.println("Bra gjort! Gissa igen!");
							}

						}

					} else {
						System.out.println("Ajajaj... Bokstaven fanns inte med");
						if (chanser == 1) {// om det var sista chansen och du svarade fel skriver den ut att gubben �r
											// h�ngd
							System.out.println();
							System.out.println("Gubben �r h�ngd");
							System.out.println();
						}
					}

				}

			}
			System.out.println("Vill du spela igen?");
			System.out.println("Skriv 0 f�r att avsluta och 1 f�r att spela igen");
			avsluta = input.nextInt();
		} while (avsluta == 1);
		System.out.println("Tack f�r att du spelade!");
		input.close();
	}

}
