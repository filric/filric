package filric;

public class manysmalluppgifter {

	public static void main(String[] args) {

		fahrenheitToKelvin(100);
		kelvinToCelcius(0);
		KmHToMs(90);
		kinetiskEnergy(2, 2);
		potentiellEnergy(2, 5);
		delta(1, 5, 9);

	}

	public static double fahrenheitToKelvin(double fahrenheit) {

		double kelvin;

		kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

		return kelvin;
	}

	public static double kelvinToCelcius(double kelvin) {

		double celcius;

		celcius = (kelvin - 273.15);

		return celcius;
	}

	public static double KmHToMs(double KmH) {
		double Ms;
		Ms = (KmH / 3.6);
		return Ms;
	}

	public static double kinetiskEnergy(double massa, double hastighet) {

		double kinetisk;

		kinetisk = massa * (hastighet * hastighet) / 2;

		return kinetisk;
	}

	public static double potentiellEnergy(double massa, double height) {

		double potentiell;

		potentiell = massa * height * 9.82;

		return potentiell;
	}

	public static double delta(double first, double second, double last) {

		double delta;

		delta = (first + second + last) / 3;

		return delta;
	}
	
	public static String smallLetters(String word) {
		
		
	}

}
