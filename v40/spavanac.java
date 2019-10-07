

import java.util.Scanner;

	public class spavanac {

		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in timme och minut");
		int timme = input.nextInt();
		int minut = input.nextInt();
		
		minut = minut - 45;
		
		if(minut<0) {
			minut = minut + 60;
			timme = timme - 1;
			if(timme<0) {
				timme = 23;
			}
		}
		System.out.println("Ny väcktid: " + timme + ":" + minut);
		
	}

}
