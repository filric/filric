

import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();
		int number;
		
		for (int i = 1; i <= cases; i++) {
			number = input.nextInt();
			
			if (number >= 0) { // om talet är positivt

				if (number % 2 == 1)
					System.out.println(number + " is odd");
				else
					System.out.println(number + " is even");
			}

			else { // om talet är negativt

				if (number % 2 == -1)
					System.out.println(number + " is odd");
				else
					System.out.println(number + " is even");
			}
		}
		
		input.close();

	}

}
