package filric;

import java.util.Scanner;

public class skrivintal0avsluardet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
	
		boolean i = false;
		do {
			String line = input.nextLine();
			if (line.equals("0")) {
				i = true;
			}
		}
		while (!i); 

	}

}
