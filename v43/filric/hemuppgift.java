package filric;

import java.util.Scanner;

public class hemuppgift {

	public static void main(String[] args) {
		
	/*	lol();
		System.out.println(max(7, 30));
		count(50);
		kelvinToCelsius(5);
		fahrenheitToCelsius(98);
		ageControl(17); */
		stair(6);
		}
 public static void lol() {
	 System.out.println("AHAHAHAHHA");
 }
 public static int max(int a, int b) {
	 
	 if(a == b || a > b)
		 
		return a;
	 
	 else {
		 return b;
	 }
 }
 public static void count(int n) {
	 
	 int i = 1;
	 
	 while(i <= n) {
		 System.out.println(i);
		 i++;
	 }
	 
 }
 public static double kelvinToCelsius(double kelvin) {
	 
	 double celsius;
	 
	 if(kelvin > 0) {
		 celsius = kelvin - 273.15;
		 return celsius; 
		 
	 }
	 else {
		 System.out.println("Syntax error");
		 return kelvin;
	 }
 }
public static double fahrenheitToCelsius(double fahrenheit) {
	 
	 double celsius;
	 
	 celsius = (fahrenheit - 32)*5/9;
	 return celsius; 
		 
 }
public static void ageControl(int age) {
	 
	 if(age < 6) {
		 System.out.println("Sm�barn f�r inte g�ra n�got");
	 }
	 else if(age < 13) {
		 System.out.println("Du f�r spela Minecraft");
	 }
	 else if(age < 15) {
		 System.out.println("Du �r ton�ring");
	 }
	 else if(age < 18) {
		 System.out.println("Du f�r k�ra moppe");
	 }
	 else if(age < 21) {
		 System.out.println("Du f�r k�ra bil");
	 }
	 else if(age < 65) {
		 System.out.println("Du f�r vuxenstraff om du g�r n�got dumt");
	 }
	 else if(age < 100) {
		 System.out.println("Du �r pension�r");
	 }
	 else {
		 System.out.println("R.I.P?");
	 }
}
public static void stair(int steps) {
	
	 int i = 1;
	 String str = "x";
	 
	 while(i <= steps) {
		 
		 System.out.println(str);
		 str = str + "x"; 
		 i++;
	 } 
}
}
