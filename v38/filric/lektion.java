package filric;

import java.util.Scanner;

	public class lektion {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//villkor

				int age = 0;//initierat variabel
		
				Scanner input = new Scanner(System.in); //g�r det m�jligt att f� input fr�n konsollen
		
		
				System.out.println("Hur gammal �r du?");
				age = input.nextInt();
		
				if (age >= 18) {
			
						System.out.println("Du �r myndig!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
				}
				else if(age > 14 && age < 18 ) {
			
						System.out.println("Du �r inte myndig �n, men du kan iallafall k�ra epa!!!!");
				}
				else {//om villkoret inte uppfylls
			
						System.out.println("Aj fan! Det verkar som n�gon fortfarande �ger dig...");
		
				}
		}

}