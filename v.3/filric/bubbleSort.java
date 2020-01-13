package filric;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 7, 8, 4, 5, 1, 9, 2, 6, 3, 0 };
		boolean swapped;
		int temp;

		System.out.println(Arrays.toString(numbers));
		
		do {
			
			swapped = false;//nollställer swapped i början av jämnförelsen	
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // byter plats på två intilligande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
					System.out.println(Arrays.toString(numbers));
				}
			}

		} while (swapped);

		
	}

}
