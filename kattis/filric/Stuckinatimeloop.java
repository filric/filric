package filric;

import java.util.Scanner;

import org.xml.sax.InputSource;

public class Stuckinatimeloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Säg ett tal mellan 1 och 100");
		
		int number = input.nextInt();
		int i = 0;
		while(i<number) {
			i = i+1;
			System.out.println(i + " Abracadabra");
		}
		
		
		
	}

}
