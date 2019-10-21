package filric;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		
		int tal1;
		int tal2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vänligen skriv in två heltal, med ett enter emellan");
		
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(minstaTal(tal1,tal2));
	}
	/**
	 * Jämför två heltal och utvärderar vilket som är minst. samt skickar tillbaka en hälsning.
	 * @param tal1
	 * @param tal2
	 * @return String hej
	 */
	 static void minstaTal(int tal1, int tal2) {
		if(tal1 <= tal2) {
			System.out.println("Minsta talet är: " + tal1);
		}
		else {
			System.out.println("Minsta talet är: " + tal2);
		}
		
		String hej = "Metoden är klar";
		
		return hej;
	}

}
