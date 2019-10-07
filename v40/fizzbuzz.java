

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in tre tal");
		int x = input.nextInt();
		int y = input.nextInt();
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % x == 0) {
				if(i % y == 0) {
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println("Fizz");
				}
			}
			
			if(i % y == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
			
		}
			
			
		
	}

}
