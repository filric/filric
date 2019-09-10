package V37;

import java.util.Scanner;

public class lektion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		String name1 = "Filippa Richardsson";
		String name2 = "Philip Thilén";
		String name3 = "Ludvig Sandstrom";
		String name4 = "Ida Dahlqvist";
		
		System.out.println("Skriv in ett namn: "); //Skriver ut ett medelande
		
		String name5 = input.nextLine(); //Läser in ett namn från konsolen
		
		System.out.println("Skriv in ett namn: ");
		
		String name6 = input.nextLine();
		
		System.out.println("\nNAMN:");
		System.out.println(name1 + "\n" + name2 + "\n" + name3 + "\n" + name4 + "\n" + name5 + "\n" + name6);

	}

}
