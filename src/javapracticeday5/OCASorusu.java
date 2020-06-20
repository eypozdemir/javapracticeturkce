package javapracticeday5;

public class OCASorusu {

	public static void main(String[] args) {
		

        String str = "M ";//M 
        str = str.concat("E ");//M E 
        String add = "S ";//S 
        str = str.concat(add);//M E S 
        str.replace("S","T");
        str = str.concat(add);//M E S S
        System.out.println(str);
/*
        Netice nasil olur?
        */
        
   /*     String names = "Eyup Fatma Emine Zeynep";
        
        names += names.replace("Emine", "");
        
        System.out.println(names); // Ekranda Eyup Fatma Emine ZeynepEyup Fatma  Zeynep yazar
   */
        
        String name = "Eyup";
        name += " Fatma";
        System.out.println(name); // Ekranda Eyup Fatma yazar

        int num = 23;  // ekranda 23
        num = num + 12;  // ekrandan 35
        num +=5;        // ekranda  40
        System.out.println(++num); // ekranda 41 yazar. oncesine ++num yazilirsa bir arttirip oyle yazar
        						   //                   sonrasina num++ yazilirsa num'i yazar arttirmayi bir sonrakine atar.Arttirip yazdirmaz
        						   //   num++ ==> önce ata sonra ekle            ++num==> önce ekle sonra ata
        
        int num2 = 32; // ekranda 32
        
        num2 = 12;   // ekranda 12
        System.out.println(num2);
        
        
	}

}
