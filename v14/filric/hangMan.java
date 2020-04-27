package filric;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.xml.internal.ws.api.pipe.NextAction;

public class hangMan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Välkommen till Hänga Gubbe");
		System.out.println();
		System.out.println("Spelet kommer gå till såhär: ");
		System.out.println("Du väljer en svårighetsgrad beroende på hur långa ord du vill gissa på");
		System.out.println("Eftersom längre ord är lättare att gissa en bokstav rätt på så är 10-20 bokstäver ");
		System.out.println("klassad som lätt. Detta betyder att ord med 1-9 bokstäver klassas som svårare.");
		System.out.println("PS! Alla ord kommer vara på svenska och med små bokstäver!");
		System.out.println();

		String[] easy = new String[5];
		easy[0] = "nostalgisk";
		easy[1] = "bronkopneumoni";// Orsakad av virus, bakterier eller luftvägsinfektion
		easy[2] = "jobbskatteavdrag";
		easy[3] = "peritonsillit"; // Även kallad halsböld
		easy[4] = "mycoplasmapneumoni";// Orsakas av en bakterie som inte har en cellvägg

		String[] hard = new String[5];
		hard[0] = "afasi"; // Afasi innebär att ha språkliga svårigheter efter en hjärnskada
		hard[1] = "miserabel";
		hard[2] = "sarv";// En fisk
		hard[3] = "autism";
		hard[4] = "id";// Också en fisk

		int avsluta = 0;
		int position = 0;
		String ordet = "";
		char[] aktuellStatus;
		// deklarerar och initzierar variabler

		do {
			System.out.println("Vilken svårighetsgrad vill du spela på?");
			System.out.println("Skriv 1 om du vill ha lätt");
			System.out.println("Skriv 2 om du vill ha svårt");
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
			for (int i = 0; i < aktuellStatus.length; i++) {// tilldelar alla tecken i aktuellStatusssträngen en _
				aktuellStatus[i] = '_';
			}
			for (int chanser = 10; chanser > 0; chanser--) {// en loop som tar bort en chans varje gång du svarar fel

				System.out.println("Här ser du ordet du ska gissa på: ");

				for (int i = 0; i < aktuellStatus.length; i++) {
					System.out.print(aktuellStatus[i]);
				}
				System.out.println();
				System.out.println("Gissa på en bokstav! Du har " + chanser + " chanser kvar!");
				String gissning = input.nextLine();
				

				if (gissning.length() != 1) {
					System.out.println("Skriv en bokstav i taget tack");
					chanser++;
				}

				if (gissning.length() == 1) {

					if (ordet.contains(gissning)) {

						chanser++;
						if (ordet.contains(gissning)) {

							int index = ordet.indexOf(gissning);// tar reda på vilken plats tecknet finns på

							while (index >= 0) {// medans index är större eller lika med 0 ska aktuellStatus fyllas med
												// den gissade bokstaven
								aktuellStatus[index] = gissning.charAt(0);
								index = ordet.indexOf(gissning, index + 1);
							}
							if (ordet.contentEquals(new String(aktuellStatus))) {// kollar om aktuellStatus är samma som
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
						if (chanser == 1) {// om det var sista chansen och du svarade fel skriver den ut att gubben är
											// hängd
							System.out.println();
							System.out.println("Gubben är hängd");
							System.out.println();
						}
					}

				}

			}
			System.out.println("Vill du spela igen?");
			System.out.println("Skriv 0 för att avsluta och 1 för att spela igen");
			avsluta = input.nextInt();
		} while (avsluta == 1);
		System.out.println("Tack för att du spelade!");
		input.close();
	}

}
