

import java.util.Scanner;

public class stones {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if (number % 2 ==1)
			System.out.println("Alice");
		else
			System.out.println("Bob");
		
		input.close();

	}

}
