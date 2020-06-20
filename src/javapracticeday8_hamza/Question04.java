package javapracticeday8_hamza;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayıyı String'e çevirin.
		 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int num = scan.nextInt();
		
		System.out.println(getRakamlarToplami(num));
		
		
		scan.close();

	}
	
	public static int getRakamlarToplami(int num) {
		
		String sayininStringi = String.valueOf(num);
		int sum = 0;		
		for(int i = 0; i < sayininStringi.length(); i++) {
			int sayiyaCevir = Integer.parseInt(sayininStringi.substring(i, i + 1));
			
			sum += sayiyaCevir;
			
		}		
		return sum;
	}

}
