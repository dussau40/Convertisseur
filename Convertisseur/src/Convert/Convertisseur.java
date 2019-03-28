package Convert;

import java.util.Scanner;

public class Convertisseur {

	public static void main(String[] args) {
		
		double Temp, Convertit;
		char reponse=' ';
		int Unite;
		
		do {
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		
		System.out.println("Choisissez le mode de convertion");
		System.out.println("1 - Convertisseur Celsius - Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit - Celsius");
		
		Scanner sc = new Scanner(System.in);
		Unite = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Température à convertir ?");
		Temp = sc.nextInt();
		sc.nextLine();
		
		if (Unite == 1) {
			Convertit = ((Temp - 32) * 5) / 9;
	        System.out.print(Temp + " °F correspond à : ");
	        System.out.println(arrondi(Convertit, 2) + " °C.");
		}
		else if (Unite==2) {
			Convertit = ((Temp - 32) * 5) / 9;
	        System.out.print(Temp + " °F correspond à : ");
	        System.out.println(arrondi(Convertit, 2) + " °C.");
		}
			
		System.out.print("Souhaitez-vous convertir une autre température ? (O/N)\n");
		reponse = sc.nextLine().charAt(0);
		
		} while (reponse !='N');
		
		System.out.print("Au revoir");
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
