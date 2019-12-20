package filric;

import java.util.Scanner;

public class uppgift7 {

	/**
	 * hj�lper dig att hitta ny musik baserat p� vilken genre du v�ljer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Switch - case �r anv�ndbart n�r man har ett best�mt antal fall som kan h�nda,
		// t ex en meny f�r anv�ndare enligt min l�rare Tomas

		Scanner input = new Scanner(System.in);

		
		String genre;

		int choice = 0;
		
		do {
			System.out.println("Hej och v�lkommen. F�rst�r att du �r tr�tt p� att lyssna p� samma musik hela tiden s� nu ska detta programmet hj�lpa dig hitta ny musik! De �nda du beh�ver g�ra �r att v�lja en genre!");
			System.out.println("(1) - Tik Tok");
			System.out.println("(2) - Throwback");
			System.out.println("(3) - Punk");
			System.out.println("(4) - Suicidal");
			System.out.println("(5) - Quit");
			System.out.println();
			System.out.print("Skriv ditt val: ");
			

			choice = input.nextInt();
			
			boolean success = false;

			while (!success) { // loopar arrayen tills att anv�ndaren skrivit in en int

				try {
					
					choice = input.nextInt();
					System.out.println();
					success = true; // om r�tt datatyp som input avslutas while-loopen

				} catch (Exception e) { // fixar felaktig input
					input.next(); // beh�vs f�r att g�ra sig av med felaktig input ovan
					System.out.println("Indexet m�ste vara ett heltal din idiot"); // eget felmeddelande till anv�ndare
				}

			}

			System.out.println(choice);

			switch (choice) {
			case 1:
				genre = "Tik Tok";
				System.out.println("Du valde " + genre + "! H�r �r lite roliga l�tar!");
				System.out.println();
				System.out.println("1. I'm Gonna Show You Crazy, av Bebe Rexha");
				System.out.println("2. Ride It, av Regard");
				System.out.println("3. Birthday Suit, av Cosmo Sheldrake");
				System.out.println();
				break;
			case 2:
				genre = "Throwback";
				System.out.println("Du valde " + genre + "! H�r �r lite roliga l�tar!");
				System.out.println();
				System.out.println("1. Take on Me, av a-ha");
				System.out.println("2. What Is Love, av Haddaway");
				System.out.println("3. Fighting Trousers, av Professor Elemental");
				System.out.println();
				break;
			case 3:
				genre = "Punk";
				System.out.println("Du valde " + genre + "! H�r �r lite roliga l�tar!");
				System.out.println();
				System.out.println("1. Bodies In The Basement, av Demented Are Go");
				System.out.println("2. Staden G�teborg, av Troublemakers");
				System.out.println("3. Turncoat, av Anti-Flag");
				System.out.println();
				break;
			case 4:
				genre = "Suicidal";
				System.out.println("Du valde " + genre + "! H�r �r lite roliga l�tar!");
				System.out.println();
				System.out.println("1. Suicidal Thoughts, av Josh A och lamjakehill");
				System.out.println("2. Keep Myself Alive, av Get Scared");
				System.out.println("3. Broken, av Lund");
				System.out.println();
				break;
			case 5:
				System.out.println("Tack f�r idag!");
				break;
			default:
				genre = "ogiltigt";
				System.out.println("Du har valt ett " + genre + " val! Synd.");
				System.out.println();
				break;
			}


		} while (choice != 5);
		input.close();
	}

}