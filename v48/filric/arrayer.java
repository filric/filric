package filric;

public class arrayer {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println(countSevens(numbers));
		System.out.println(countTom(names));
		System.out.println(hittaNamn(names));
		System.out.println(summeraEven(numbers));
		System.out.println(countAll(numbers));
		System.out.println(hitta5bok(names));

	}

	public static String countSevens(int[] tal) {

		int antal7 = 0;
		for (int i = 0; i < tal.length; i++) {
			if (tal[i] == 7) {
				antal7++;
			}
		}
		return "Antal sjuor �r " + antal7;
	}

	public static String countTom(String[] namn) {

		int antalTom = 0;
		for (int i = 0; i < namn.length; i++) {
			if (namn[i] == "Tom") {
				antalTom++;
			}
		}
		return "Antal Tom �r " + antalTom;
	}

	public static String hittaNamn(String[] namn) {

		int index = -1;
		for (int i = 0; i < namn.length; i++) {
			if (namn[i] == "Drusilla") {
				index = i;
			}
		}
		return "Indexet �r " + index;
	}

	public static String summeraEven(int[] tal) {

		int summa = 0;

		for (int i = 0; i < tal.length; i++) {
			if (tal[i] % 2 == 0) {
				summa = summa + tal[i];
			}
		}
		return "Summan �r " + summa;
	}

	public static String countAll(int[] tal) {

		int antal0 = 0;
		int antal1 = 0;
		int antal2 = 0;
		int antal3 = 0;
		int antal4 = 0;
		int antal5 = 0;
		int antal6 = 0;
		int antal7 = 0;
		int antal8 = 0;
		int antal9 = 0;

		for (int i = 0; i < tal.length; i++) {

			if (tal[i] == 0) {
				antal0++;
			}
			if (tal[i] == 1) {
				antal1++;
			}
			if (tal[i] == 2) {
				antal2++;
			}
			if (tal[i] == 3) {
				antal3++;
			}
			if (tal[i] == 4) {
				antal4++;
			}
			if (tal[i] == 5) {
				antal5++;
			}
			if (tal[i] == 6) {
				antal6++;
			}
			if (tal[i] == 7) {
				antal7++;
			}
			if (tal[i] == 8) {
				antal8++;
			}
			if (tal[i] == 9) {
				antal9++;

			}
		}

		return "Antal 0:or �r " + antal0 + ". Antal 1:or �r " + antal1 + ". Antal 2:or �r " + antal2
				+ ". Antal 3:or �r " + antal3 + ". Antal 4:or �r " + antal4 + ". Antal 5:or �r " + antal5
				+ ". Antal 6:or �r " + antal6 + ". Antal 7:or �r " + antal7 + ". Antal 8:or �r " + antal8
				+ ". Antal 9:or �r " + antal9 + ".";
	}

	public static String hittaL(String[] namn) {

		int antal = 0;
		for (int i = 0; i < namn.length; i++) {
			if (namn[i].charAt(0) == 'L') {
				antal++;
			}
		}
		return "Antal L �r " + antal;
	}
	public static String hitta5bok(String[] namn) {

		int antal = 0;
		for (int i = 0; i < namn.length; i++) {
			if (namn[i].length() == 5) {
				antal++;
			}
		}
		return "Antal namn med 5 bokst�ver �r " + antal;
	}
	
	

}
