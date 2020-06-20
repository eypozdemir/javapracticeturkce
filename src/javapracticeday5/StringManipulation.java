package javapracticeday5;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir mail adresi girin: ");
		String mail= scan.nextLine();
		
		if(mail.contains("hotmail")) {
			mail=mail.replace("hotmail", "gmail");
			System.out.println(mail);
		}
		scan.close();

	}

}
