package filric;

public class manysmalluppgifter {

	public static void main(String[] args) {
		
	}
public static double fahrenheitToKelvin(double fahrenheit) {
	
	double kelvin;
	
	kelvin = (fahrenheit - 32)*5/9 + 273.15;
	
	return kelvin;
}
public static double kelvinToCelcius(double kelvin) {
	
	double celcius;
	
	celcius = (kelvin - 273.15);
	
	return celcius;
}
public static double KmHToMs(double KmH) {
	double Ms;
	Ms = (KmH/3.6);
	return Ms;
}
}
