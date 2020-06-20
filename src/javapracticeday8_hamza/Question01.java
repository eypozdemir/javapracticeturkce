package javapracticeday8_hamza;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/* Santimetreyi, metreye ve kilometreye çeviren bir program yazınız.
		 Çıktı : 
		 Lütfen santimetre değerini giriniz:
		 	212
		 212 santimetre 2.12 metre ve 0.00212 kilometreye eşittir.
		İpucu : 100 cm = 1 mt = 0.001 kilometre
				1 km 0 100000 CM DIR
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen santimetre değerini giriniz:");
		double cm = scan.nextDouble();
		
		double metre = cm/100;
		double kiloMetre = cm/100000;
		
		
		System.out.println(cm + " cm = " + metre + " metredir.");
		System.out.println(cm + " cm = " + kiloMetre + " kilometredir.");
		
		System.out.println();
		System.out.println(cm + " cm = " + getMetre(cm) + " metredir.");
		System.out.println(cm + " cm = " + getKilometre(cm) + " kilometredir.");
		
		scan.close();

	}
	
	private static double getMetre(double cm) {
		
		return cm/100;
	}
	
	private static double getKilometre(double cm) {
		
		return cm/100000;
	}

}
