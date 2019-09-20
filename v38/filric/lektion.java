package filric;

import java.util.Scanner;

	public class lektion {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//villkor

				int age = 0;//initierat variabel
		
				Scanner input = new Scanner(System.in); //gör det möjligt att få input från konsollen
		
		
				System.out.println("Hur gammal är du?");
				age = input.nextInt();
		
				if (age >= 18) {
			
						System.out.println("Du är myndig!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
				}
				else if(age > 14 && age < 18 ) {
			
						System.out.println("Du är inte myndig än, men du kan iallafall köra epa!!!!");
				}
				else {//om villkoret inte uppfylls
			
						System.out.println("Aj fan! Det verkar som någon fortfarande äger dig...");
		
				}
		}

}