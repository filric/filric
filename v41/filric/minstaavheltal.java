package filric;

import java.util.Scanner;

public class minstaavheltal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Skriv tv� tal");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x < y) {
			System.out.println("Det minsta talet �r " + x);
		}
		if(x > y) {
			System.out.println("Det minsta talet �r " + y);
		}
	}

}
