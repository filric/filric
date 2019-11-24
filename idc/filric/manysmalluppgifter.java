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
		System.out.println(storaLetter("jag vill bli godk�nd i programmering<3"));
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
		 *  denna metoden omvandlar grader fahrenheit till grader kelvin med hj�lp av formeln ovan
		 */
	}

	public static double kelvinToCelsius(double kelvin) {

		double celsius;

		celsius = (kelvin - 273.15);

		return celsius;
		/*
		 * denna metoden omvandlar grader kelvin till grader celsius med hj�lp av formeln ovan
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
		 * r�knar ut kinetisk energi med hj�lp av massan och hastigheten
		 */
	}

	public static double potentiellEnergy(double massa, double height) {

		double potentiell;

		potentiell = massa * height * 9.82;

		return potentiell;
		/*
		 * r�knar ut potentiell energi med hj�lp av massa och h�jd
		 */
	}

	public static double delta(double first, double second, double last) {

		double delta;

		delta = (first + second + last) / 3;

		return delta;
		/*
		 * en metod som r�knar ut medelv�rdet p� tre angivna tal
		 */
	}
	
	public static String smallLetters(String word) {
		
		word = word.toLowerCase();
		
		return word;
		/*
		 * metoden byter alla stora bokst�ver till sm� bokst�ver
		 */
	}
	public static String storaLetter(String word) {
		
		word = word.replace('o', '0').toUpperCase();
		
		return word;
		/*
		 * metoden byter alla sm� bokst�ver till stora bokst�ver, f�rutom o som byts ut mot 0
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
		 * metoden r�knar ut tiden med hj�lp av str�ckan och hastigheten
		 * metoden undviker division med noll och returnerar ist�llet 99.99
		 */
	}
	public static double work(double force, double distance) {
		
		return force*distance;
		/*
		 * metoden r�knar ut arbetet med hj�lv av kraft och str�cka
		 */
	}
	public static double velocityToHeight(double velocity) {
		
		return (velocity*velocity)/(2*9.82);
		/*
		 * metoden r�knar ut hur l�ngt ett f�rem�l kommer utg�ende fr�n en hastighet upp�t
		 */
	}
	public static double sphereVolumeToRadius(double Volume) {
		
		return Math.pow((3*Volume)/(Math.PI*4), 0.33333333333333333333);
		/*
		 * metoden r�knar ut radien p� en sf�r med hj�lp av volymen och formeln ovan
		 */
		
	}
	public static int sheepLegs(int sheep) {
		
		return sheep*4;
		/*
		 * metoden antar hur m�nga ben det finns p� ett antal f�r genom att multiplicera dem med fyra
		 */
	}
	public static double crashedPotsByKitten(int hour) {
		
		double random;
		 random = Math.random();
		 return Math.round(3*hour*random);
		 /*
		  * metoden ger en uppskattning p� hur m�nga krukor min kattunge hinner v�lta under ett antal timmar
		  * ger ett heltal som �r under 3 per timme
		  */
	}
}
