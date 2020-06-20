package javapracticeday8_hamza;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/* 2. Kullanıcının girdiği sayının, while döngüsü kullanarak 
		 * 			 rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayının %10'unu alarak son hanesini al ve toplama ekle.
		 * 3. Adım : Daha sonra sayıyı son haneden kurtarmak için 10'a böl.
		 * 4. Adım : Sayı 0 olarak kadar bu işlemi while döngüsü ile tekrarla.
		 * 
		 * Bunu da method kullanarak yapalım, toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int num = scan.nextInt();
		
		System.out.println(getRakamlarToplami(num));
		
		
		scan.close();

	}
	public static int getRakamlarToplami(int num) {
		int sum = 0;
		while(num>0) {
			int sonHane = num%10;
			sum = sum + sonHane;
			num = num/10;
			
			
	//		sum = sum + num%10;
	//		num = num/10;
		}
		return sum;
	}

}
