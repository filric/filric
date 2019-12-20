package filric;

import java.util.Scanner;

public class uppgift7 {

	/**
	 * hjälper dig att hitta ny musik baserat på vilken genre du väljer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare enligt min lärare Tomas

		Scanner input = new Scanner(System.in);

		
		String genre;

		int choice = 0;
		
		do {
			System.out.println("Hej och välkommen. Förstår att du är trött på att lyssna på samma musik hela tiden så nu ska detta programmet hjälpa dig hitta ny musik! De ända du behöver göra är att välja en genre!");
			System.out.println("(1) - Tik Tok");
			System.out.println("(2) - Throwback");
			System.out.println("(3) - Punk");
			System.out.println("(4) - Suicidal");
			System.out.println("(5) - Quit");
			System.out.println();
			System.out.print("Skriv ditt val: ");
			

			choice = input.nextInt();
			
			boolean success = false;

			while (!success) { // loopar arrayen tills att användaren skrivit in en int

				try {
					
					choice = input.nextInt();
					System.out.println();
					success = true; // om rätt datatyp som input avslutas while-loopen

				} catch (Exception e) { // fixar felaktig input
					input.next(); // behövs för att göra sig av med felaktig input ovan
					System.out.println("Indexet måste vara ett heltal din idiot"); // eget felmeddelande till användare
				}

			}

			System.out.println(choice);

			switch (choice) {
			case 1:
				genre = "Tik Tok";
				System.out.println("Du valde " + genre + "! Här är lite roliga låtar!");
				System.out.println();
				System.out.println("1. I'm Gonna Show You Crazy, av Bebe Rexha");
				System.out.println("2. Ride It, av Regard");
				System.out.println("3. Birthday Suit, av Cosmo Sheldrake");
				System.out.println();
				break;
			case 2:
				genre = "Throwback";
				System.out.println("Du valde " + genre + "! Här är lite roliga låtar!");
				System.out.println();
				System.out.println("1. Take on Me, av a-ha");
				System.out.println("2. What Is Love, av Haddaway");
				System.out.println("3. Fighting Trousers, av Professor Elemental");
				System.out.println();
				break;
			case 3:
				genre = "Punk";
				System.out.println("Du valde " + genre + "! Här är lite roliga låtar!");
				System.out.println();
				System.out.println("1. Bodies In The Basement, av Demented Are Go");
				System.out.println("2. Staden Göteborg, av Troublemakers");
				System.out.println("3. Turncoat, av Anti-Flag");
				System.out.println();
				break;
			case 4:
				genre = "Suicidal";
				System.out.println("Du valde " + genre + "! Här är lite roliga låtar!");
				System.out.println();
				System.out.println("1. Suicidal Thoughts, av Josh A och lamjakehill");
				System.out.println("2. Keep Myself Alive, av Get Scared");
				System.out.println("3. Broken, av Lund");
				System.out.println();
				break;
			case 5:
				System.out.println("Tack för idag!");
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