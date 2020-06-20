package javapracticeday5;

public class ObjectOrnek {

	public static void main(String[] args) {
		
		//StringBuilder Java'nin 5. versiyonunda olusturuldu. StringBuffer'lar
		//StringBuilder'larin eski versiyonudur.Stringbuilder'lar daha hizli calisir.
		//Bu yuzden StringBuilder kullanmayi tercih edin.
		
		// StringBuilder mutable  ==   String immutuble
		// yavas ve guvenli hareket ediyor
		
		
		// StringBuilder class’ı String üretmeye ve üretilen Stringleri manipüle etmeye yarar.
				// String class’ı kullanarak String üretirseniz eğer yaptığınız değişiklikler ilk ürettiğiniz
				// Stringi etkilemez.Ama illaki ilk ürettiğim string değişsin isterseniz atama
				// yapmak zorundasınız.
				// String class’ını kullanarak ürettiğiniz stringler atamasız değiştirilemedeği için
				// String class’ına “immutable” denir.
				// String ile uretilen Stringlerde yapilan degisiklikler 
				// ilk uretilen (orijinal olan) Stringi degistrmezken 
				// StringBuilder ile uretilen Stringlerde yapilan degisiklikler 
				// ilk uretilen orijinal Stringi degistirir. 
				// Yani Stringlerde degisim ilk Stringi etkilemez ama StringBuilderde etkilenir.
				// StringBuilder Class’ını kullanarak String üretirseniz yaptığınız değişiklikler
				// ilk ürettiğiniz STring’i etkiler. Atama yapmaya gerek yoktur.
				// StringBuilder Class’ı değişimi yansıttığı için ona “mutable” denir.
		
		
		
/*		
		StringBuilder stb = new StringBuilder();  
		stb.append("Eyup"); // burada atama yapiyoruz. Yani eklemis oluyoruz
		System.out.println(stb.equals(stb.reverse().toString()));
                                   
		
*//*		
		StringBuilder stb2 = new StringBuilder();  
		stb2.append("Fatma"); // burada atama yapiyoruz. Yani eklemis oluyoruz
		System.out.println(stb2);
		System.out.println(stb2.reverse());// burda tersten yazdiriyoruz. Ekranda amtaF yazar
		
		System.out.println(stb2.equals(stb2.reverse().toString()));
						//  stb2 ile st2'nin tersini equals ile karsilastiriyoruz.
						// Objectler ayni oldugu icin ayni memory noktasini reference ediyorlar.Onun icin ayni deyip ekrana True yazar
						// .toString() ekleyince ilki olan Object'i ve sonrasinda String'e cevirdigimiz icin farkli adresler oldugu icin
						// Yani atama yapilan deger ile degerin tersi ayni olmadigi icin toString() ile ekranda false yazar
		
*/		
		String name = "mahmut";
		String name2 = "mahmut";
		System.out.println(name.equals(name2)); // Degerleri karsilastirdigi icin true yazar
		
		
	}

}
