package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız. 
		 * 
		 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
		 * 2. Adım : Kullanıcıdan tahminini alalım.
		 * 3. Adım : Kullanıcının girdiği tahmini, bilgisayarın ürettiği 
		 * 			 rastgele sayı ile karşılaştıralım.
		 * 4. Adım : Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, 
		 * 			 bunu da while döngüsü ile yapalım.
		 *
		 * */
		
		Random random = new Random();
		int rastgeleSayi= random.nextInt(10);
		System.out.println(rastgeleSayi);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tahmin sayisi girin:");
		int tahmin = scan.nextInt();
		
		
		
		while(tahmin!=rastgeleSayi) {
			if(tahmin>rastgeleSayi) {
				System.out.println("Yuksek sayi girdiniz");
			}else if(tahmin <rastgeleSayi) {
				System.out.println("Dusuk sayi girdiniz");
			}
			System.out.println("Bir tahmin sayisi girin:");
		    tahmin = scan.nextInt();
		}
		System.out.println("Tebrikler Kazandiniz...");

		scan.close();
	}

}
