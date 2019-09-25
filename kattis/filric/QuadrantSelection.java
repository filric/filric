package filric;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class QuadrantSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in ditt x värde");
		int x = input.nextInt();
		
		System.out.println("Skriv in ditt y värde");
		int y = input.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("Quadrant 1");
		}
		if(x<0 && y>0) {
			System.out.println("Quadrant 2");
		}
		if(x<0 && y<0) {
			System.out.println("Quadrant 3");
		}
		if(x>0 && y<0) {
			System.out.println("Quadrant 4");
		}
	}

}
