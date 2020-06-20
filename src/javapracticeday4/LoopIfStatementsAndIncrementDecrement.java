package javapracticeday4;


public class LoopIfStatementsAndIncrementDecrement {

	public static void main(String[] args) {

		/*
		 * Yeni bir class olusturunuz adi LoopIfStatementsAndIncrementDecrement olsun
		 * bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle
		 * olmalidir; 
		 * 1_uzunlugu => en az 8 karakter (chars) olmalidir 
		 * 2_icinde sadece alfabetik karakterler bulunmalidir 
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Kullanici adi giriniz: ");
//		String userName = scan.nextLine();
//		
//		if (userName.length()>=8) {
//			System.out.println("Kullanici adiniz 8 characterden az olamaz");
//		}else if( ) {
//			
//		}
		// indexi 01234
		String userName = "EmineZeynep".toLowerCase(); // length'i = 5
		int count = 0;

		if (userName.length() >= 8) {
			for (int i = 0; i < userName.length(); i++) {
				char temp = userName.charAt(i);
				if (temp < 'a' || temp > 'z') {
					count++;
				}
			}

			if (count == 0) {
				System.out.println("Olusturdugunuz user name basarili bir sekilde olusturulmustur.");
			} else {
				System.out.println("User name basarili bir sekilde olusturulamamistir.");
				System.out.println("Lutfen tekrar deneyiniz");
			}
		} else {
			System.out.println("User name length'i yetersizdir");
			System.out.println("Lutfen tekrar deneyiniz");
		}

	}

}
