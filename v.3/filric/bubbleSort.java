package filric;

import java.util.Scanner;
import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("");

		int[] numbers = new int[50];
		boolean swapped;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {//slumpar 50 heltal mellan 0-100
			numbers[i] = (int) (Math.random()*100);
		}

		System.out.println(Arrays.toString(numbers));

		do {

			swapped = false;// nollst�ller swapped i b�rjan av j�mnf�relsen
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats p� tv� intilligande tal
					temp = numbers[i]; // sparar tillf�lligt v�rdet p� v�nstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
									}
			}

		} while (swapped);
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
