package javapracticeday6;

import java.util.Scanner;

public class IfStatementVeTernary {

	public static void main(String[] args) {
		
		// Kullanicidan 2 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk olarak konsola yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. sayiyi girin:");
		int num1 = scan.nextInt();
		System.out.println("2. sayiyi girin:");
		int num2 = scan.nextInt();
		
//		if(num1>=num2) {
//			System.out.println("En buyuk numara: " + num1);
//			System.out.println("En kucuk numara: " + num2);
//		}else {
//			System.out.println("En buyuk numara: " + num2);
//			System.out.println("En kucuk numara: " + num1);
//		}
//		
		
		
		// Ayni soruyu ternary ile yapalim
		String result = (num1>=num2 ? "Buyuk sayi: " + num1 + "" +"\n Kucuk sayi: " + num2 :"Buyuk sayi: " + num2 + "\nKucuk sayi: " + num1);
		System.out.println(result);

		scan.close();
	}

}
