package javapracticeday7;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
		// geri kalan harfleri kucuk yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz:");
		String name = scan.nextLine();
		System.out.println("Soyadinizi giriniz:");
		String soyAd = scan.nextLine();

		System.out.println("Adiniz ve Soyadiniz : " + name.toUpperCase().charAt(0)+ name.substring(1,name.length()) +" "+ 
		soyAd.toUpperCase().charAt(0)+ soyAd.substring(1,soyAd.length()));
		
		
//    FARKLI BIR YOL:
		
//		  System.out.println("Isminizi ve soy isminiz bir bosluk ara ile yaziniz");
//	        String isimSoyIsim = scan.nextLine();
//	        
//	        int ikinciBasNok = isimSoyIsim.indexOf(" "); 
//	      System.out.print(isimSoyIsim.substring(0,1).toUpperCase());
//	      System.out.print(isimSoyIsim.substring(1, ikinciBasNok+1).toLowerCase());
//	      System.out.print(isimSoyIsim.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());
//	      System.out.println(isimSoyIsim.substring(ikinciBasNok+2).toLowerCase());
//	      

	
//	    FARKLI BIR YOL: ARRAY ILE
		
//		 String [] isimler = isimSoyIsim.split(" ");
//	        
//	        for (int i = 0; i < isimler.length; i++) {
//	            isimler[i] = isimler[i].toLowerCase();
//	          if(isimler.length-1 != i  ) //
//	            System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1)+" ");
//	          else
//	              System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1));
//	        }

		
		
		scan.close();
	}

}
