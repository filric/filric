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
		System.out.println("PS! Alla ord kommer vara p� svenska!");

		String[] easy = new String[5];
		easy[0] = "Nostalgisk";
		easy[1] = "Bronkopneumoni";// Orsakad av virus, bakterier eller luftv�gsinfektion
		easy[2] = "Jobbskatteavdrag";
		easy[3] = "Peritonsillit"; // �ven kallad halsb�ld
		easy[4] = "Mycoplasmapneumoni";// Orsakas av en bakterie som inte har en cellv�gg

		String[] hard = new String[5];
		easy[0] = "Afasi"; // Afasi inneb�r att ha spr�kliga sv�righeter efter en hj�rnskada
		easy[1] = "Miserabel";
		easy[2] = "Sarv";// En fisk
		easy[3] = "Autism";
		easy[4] = "Id";// Ocks� en fisk

		int avsluta = 0;

		do {
			System.out.println("Vilken sv�righetsgrad vill du spela p�?");
			System.out.println("Skriv 1 om du vill ha l�tt");
			System.out.println("Skriv 2 om du vill ha sv�rt");
			int easyHard = input.nextInt();
			if (easyHard == 1) {
				

			}
			if (easyHard == 2) {

			}
			String ordet = "hej";

			for (int chanser = 10; chanser > 0; chanser--) {// en loop som tar bort en chans varje g�ng du svarar fel
				System.out.println("Gissa p� en bokstav! Du har " + chanser + " chanser kvar!");
				String gissning = input.nextLine();

				if (ordet.length() != 1) {
					System.out.println("Skriv en bokstav i taget tack");
					chanser++;
				}

				if (ordet.length() == 1) {

					if (ordet.contains(gissning)) {
						chanser++;

					}
				}

			}
			System.out.println("Vill du spela igen?");
			System.out.println("Skriv 0 f�r att avsluta och 1 f�r att spela igen");
			avsluta = input.nextInt();
		} while (avsluta == 1);

	}

}
