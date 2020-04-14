package filric;

public class hangMan {

	public static void main(String[] args) {
		
		System.out.println("Välkommen till Hänga Gubbe");
		System.out.println();
		System.out.println("Spelet kommer gå till såhär: ");
		System.out.println("Du väljer en svårighetsgrad beroende på hur långa ord du vill gissa på");
		System.out.println("Eftersom längre ord är lättare att gissa en bokstav rätt på så är 10-20 bokstäver ");
		System.out.println("klassad som lätt. Detta betyder att ord med 1-9 bokstäver klassas som svårare.");
		System.out.println("PS! Alla ord kommer vara på svenska!");
		
		String[] easy = new String[5];
		easy[0] = "Nostalgisk";
		easy[1] = "Bronkopneumoni";//Orsakad av virus, bakterier eller luftvägsinfektion
		easy[2] = "Jobbskatteavdrag";
		easy[3] = "Peritonsillit"; //Även kallad halsböld
		easy[4] = "Mycoplasmapneumoni";//Orsakas av en bakterie som inte har en cellvägg
		
		
		String[] hard = new String[5];
		easy[0] = "Afasi"; //Afasi innebär att ha språkliga svårigheter efter en hjärnskada
		easy[1] = "Miserabel";
		easy[2] = "Sarv";//En fisk
		easy[3] = "Autism"; 
		easy[4] = "Id";//Också en fisk
		
		for (int chanser = 10; chanser > 0; chanser--) {//en loop som tar bort en chans varje gång du svarar fel 
			System.out.println("Gissa på en bokstav! Du har " + chanser + " chanser kvar!");
			

			
			if(gissning = en bokstav i ordet) {
				chanser++
				
			}
			
		}
		
	}

}
