package V37;

import java.util.Scanner;

public class hemuppgift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		
		String name1 = input.nextLine();
		
		System.out.println("Hur gammal ‰r du?");
		
		String name2 = input.nextLine();

		System.out.println("Vad ‰r din adress?");
		
		String name3 = input.nextLine();
		
		System.out.println("Vad ‰r ditt postnummer?");
		
		String name4 = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		
		String name5 = input.nextLine();
		
		System.out.println("Vad ‰r ditt telefonnummer?");
		
		String name6 = input.nextLine();
		
		System.out.println("\nInformation:");
		System.out.println("\nNamn: \t\t" + name1 + "\n≈lder: \t\t" + name2 + "\nAdress: \t" + name3 + "\n \t\t" + name4 + "\t" + name5 + "\nTelefon: \t" + name6 );
	}

}
