package filric;

public class manysmalluppgifter {

	public static void main(String[] args) {

		System.out.println(fahrenheitToKelvin(100));
		System.out.println(kelvinToCelsius(0));
		System.out.println(KmHToMs(90));
		System.out.println(kinetiskEnergy(2, 2));
		System.out.println(potentiellEnergy(2, 5));
		System.out.println(delta(1, 5, 9));
		System.out.println(smallLetters("PaPPaRaZZi"));
		System.out.println(storaLetter("jag vill bli godkänd i programmering<3"));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(velocityToHeight(9.82));
		System.out.println(sphereVolumeToRadius(20));
		System.out.println(sheepLegs(12));
		System.out.println(crashedPotsByKitten(2));

	}

	public static double fahrenheitToKelvin(double fahrenheit) {

		double kelvin;

		kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

		return kelvin;
		/* 
		 *  denna metoden omvandlar grader fahrenheit till grader kelvin med hjälp av formeln ovan
		 */
	}

	public static double kelvinToCelsius(double kelvin) {

		double celsius;

		celsius = (kelvin - 273.15);

		return celsius;
		/*
		 * denna metoden omvandlar grader kelvin till grader celsius med hjälp av formeln ovan
		 */
	}

	public static double KmHToMs(double KmH) {
		double Ms;
		Ms = (KmH / 3.6);
		return Ms;
		/*
		 * denna metoden omvandlar hastighet i kilometer per timme till meter per sekund
		 */
	}

	public static double kinetiskEnergy(double massa, double hastighet) {

		double kinetisk;

		kinetisk = massa * (hastighet * hastighet) / 2;

		return kinetisk;
		/*
		 * räknar ut kinetisk energi med hjälp av massan och hastigheten
		 */
	}

	public static double potentiellEnergy(double massa, double height) {

		double potentiell;

		potentiell = massa * height * 9.82;

		return potentiell;
		/*
		 * räknar ut potentiell energi med hjälp av massa och höjd
		 */
	}

	public static double delta(double first, double second, double last) {

		double delta;

		delta = (first + second + last) / 3;

		return delta;
		/*
		 * en metod som räknar ut medelvärdet på tre angivna tal
		 */
	}
	
	public static String smallLetters(String word) {
		
		word = word.toLowerCase();
		
		return word;
		/*
		 * metoden byter alla stora bokstäver till små bokstäver
		 */
	}
	public static String storaLetter(String word) {
		
		word = word.replace('o', '0').toUpperCase();
		
		return word;
		/*
		 * metoden byter alla små bokstäver till stora bokstäver, förutom o som byts ut mot 0
		 */
	}
	public static double svtTime(double distance, double velocity) {
		
		if(velocity != 0) {
			return distance/velocity;
		}
		else {
			return 99.99;
		}
		/*
		 * metoden räknar ut tiden med hjälp av sträckan och hastigheten
		 * metoden undviker division med noll och returnerar istället 99.99
		 */
	}
	public static double work(double force, double distance) {
		
		return force*distance;
		/*
		 * metoden räknar ut arbetet med hjälv av kraft och sträcka
		 */
	}
	public static double velocityToHeight(double velocity) {
		
		return (velocity*velocity)/(2*9.82);
		/*
		 * metoden räknar ut hur långt ett föremål kommer utgående från en hastighet uppåt
		 */
	}
	public static double sphereVolumeToRadius(double Volume) {
		
		return Math.pow((3*Volume)/(Math.PI*4), 0.33333333333333333333);
		/*
		 * metoden räknar ut radien på en sfär med hjälp av volymen och formeln ovan
		 */
		
	}
	public static int sheepLegs(int sheep) {
		
		return sheep*4;
		/*
		 * metoden antar hur många ben det finns på ett antal får genom att multiplicera dem med fyra
		 */
	}
	public static double crashedPotsByKitten(int hour) {
		
		double random;
		 random = Math.random();
		 return Math.round(3*hour*random);
		 /*
		  * metoden ger en uppskattning på hur många krukor min kattunge hinner välta under ett antal timmar
		  * ger ett heltal som är under 3 per timme
		  */
	}
}
