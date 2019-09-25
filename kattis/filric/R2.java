package filric;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv två tal");
		double r1 = input.nextInt();
		double s = input.nextInt();
		
		double r2 = (s*2-r1);
		
		System.out.println(r2);
		
	}

}
