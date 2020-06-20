package javapracticeday7;

public class Case {
	/*
    Case sinifi olusturunuz ve icin de 2 String variable olsun ve private olsunlar
    sonra getter ve setterlar kullaniniz
    String actualCase;//suan durumu
    String emergencey; // acil durum
*/

	
	private String actualCase;
	private String emergency;
	
	
	public static void main(String[] args) {

	}


	public String getActualCase() {
		return actualCase;
	}


	public void setActualCase(String actualCase) {
		this.actualCase = actualCase;
	}


	public String getEmergency() {
		return emergency;
	}


	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

}
