package filric;

import java.util.Scanner;

public class hemuppgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	
		System.out.println("Säg fem heltal");
		int z = input.nextInt();
		int x = input.nextInt();
		int c = input.nextInt();
		int v = input.nextInt();
		int b = input.nextInt();
		
		int smallest = z;
		int biggest = z;
		
		if (smallest < x) {
			smallest = x;
		}
		if (smallest < c) {
			smallest = c;
		}
		if (smallest < v) {
			smallest = v;
		}
		if (smallest < b) {
			smallest = b;
		}
		
		if (biggest > x) {
			biggest = x;
		}
		if (biggest > c) {
			biggest = c;
		}
		if (biggest > v) {
			biggest = v;
		}
		if (biggest > b) {
			biggest = b;
		}
		
		
		
		double medelvarde = (z + x + c + v + b) / 5;
		
		System.out.println("Högst: " + biggest);
		System.out.println("Lägst: " + smallest);
		System.out.println("Medelvärde: " + medelvarde);
	}

}
