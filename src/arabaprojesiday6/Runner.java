package arabaprojesiday6;

public class Runner {

	public static void main(String[] args) {
		
		// polymorphism ==>Bir methodu çoklu yapı haline getiriyorsak poli yapmış oluyoruz
		
		//            reference type     obje tipi (object type)
		// polymorphism :  Car  araba1 = new Toyota();
		
		Car araba1 = new Honda();  //  Car class'i reference oluyor
		System.out.println("Arabanin markasi: " + araba1.arabaMarkasi());
		System.out.println("Arabanin modeli: " + araba1.arabaModeli());
		System.out.println("Arabanin yili: " + araba1.arabaYili());
		
		System.out.println("===========================");
		
		Car araba2 = new Honda("Jazz",2020);
		System.out.println("Arabanin markasi: " + araba2.arabaMarkasi());
		System.out.println("Arabanin modeli: " + araba2.arabaModeli());
		System.out.println("Arabanin yili: " + araba2.arabaYili());

	}

}
