package filric;

public class hangMan {

	public static void main(String[] args) {
		
		System.out.println("V�lkommen till H�nga Gubbe");
		System.out.println();
		System.out.println("Spelet kommer g� till s�h�r: ");
		System.out.println("Du v�ljer en sv�righetsgrad beroende p� hur l�nga ord du vill gissa p�");
		System.out.println("Eftersom l�ngre ord �r l�ttare att gissa en bokstav r�tt p� s� �r 10-20 bokst�ver ");
		System.out.println("klassad som l�tt. Detta betyder att ord med 1-9 bokst�ver klassas som sv�rare.");
		System.out.println("PS! Alla ord kommer vara p� svenska!");
		
		String[] easy = new String[5];
		easy[0] = "Nostalgisk";
		easy[1] = "Bronkopneumoni";//Orsakad av virus, bakterier eller luftv�gsinfektion
		easy[2] = "Jobbskatteavdrag";
		easy[3] = "Peritonsillit"; //�ven kallad halsb�ld
		easy[4] = "Mycoplasmapneumoni";//Orsakas av en bakterie som inte har en cellv�gg
		
		
		String[] hard = new String[5];
		easy[0] = "Afasi"; //Afasi inneb�r att ha spr�kliga sv�righeter efter en hj�rnskada
		easy[1] = "Miserabel";
		easy[2] = "Sarv";//En fisk
		easy[3] = "Autism"; 
		easy[4] = "Id";//Ocks� en fisk
		
		for (int chanser = 10; chanser > 0; chanser--) {//en loop som tar bort en chans varje g�ng du svarar fel 
			System.out.println("Gissa p� en bokstav! Du har " + chanser + " chanser kvar!");
			

			
			if(gissning = en bokstav i ordet) {
				chanser++
				
			}
			
		}
		
	}

}
