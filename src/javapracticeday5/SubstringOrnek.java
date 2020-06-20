package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		
		/*
		uKullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		ue.g:
		umehmet ==>  mehahmetmet
		uahmet
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.kelimeyi girin: ");
		String str1 = scan.nextLine();
		System.out.println("2.kelimeyi girin: ");
		String str2 = scan.nextLine();
		
		
		if(str1.length()%2==0) {
			int i = str1.length()/2;
	//		System.out.println(str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2));
			String isim = str1.substring(0,i)+str2+str1.substring(i);
			System.out.println(isim);
		}
		scan.close();
	}

}
