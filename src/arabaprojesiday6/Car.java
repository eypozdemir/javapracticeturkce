package arabaprojesiday6;

public class Car extends Runner {

	 protected String make ;
	 protected String model;
	 protected int year ;
	    
	public static void main(String[] args) {
		
		/*
	    Bir class olusturunuz adi Car olsun
	    icerisinde 3 instance variable olsun 
	    protected String make ;
	    protected String model;
	    protected int year ;
	    
	    Sonra 3 tane String return tipinden method olusturunuz
	    arabaMarkasi
	    arabaModeli
	    arabaYili
	    ve iki constructor olusturunuz 
	    
	    1 parametreli
	    1 parametresiz
	    String model;
	    int year
	    Son olarak bir oject olusturup method lari main method da print ediniz 
	    */

/*
		 Honda Car01 = new Honda();
	     System.out.println("Arabanin markasi: " + Car01.arabaMarkasi());
	     System.out.println("Arabanin modeli:  " + Car01.arabaModeli());
	     System.out.println("Arabanin yili :   " + Car01.arabaYili());
	     
	     System.out.println("========================================");
	        
	     Honda Car02 = new Honda ("Civic", 2014);
	     System.out.println("Arabanin markasi: " + Car02.arabaMarkasi());
	     System.out.println("Arabanin modeli:  " + Car02.arabaModeli());
	     System.out.println("Arabanin yili :   " + Car02.arabaYili());
	 
*/
	}
	
	public Car() {
		
    }
	public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String arabaMarkasi() {
        return make;
    }
    public String arabaModeli() {
        return model;
    }
    public int arabaYili() {
        return year;
    }
	
	

}
