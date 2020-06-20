package javapracticeday6;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */

		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Lutfen bir cumle yaziniz!");
	        String cumle = scan.nextLine();
	        
	        //I love Java //
	        
	        
	        int ilkBosluk = cumle.indexOf(" ");
	        int sonuncuBosluk = cumle.lastIndexOf(" ");
	        
	        
//	      System.out.println(cumle.substring(7)+cumle.substring(1,7)+cumle.substring(0,1));
	        System.out.println(cumle.substring(sonuncuBosluk+1)+cumle.substring(ilkBosluk,sonuncuBosluk+1)+cumle.substring(0,ilkBosluk));

	   scan.close();
	    
	}

}
