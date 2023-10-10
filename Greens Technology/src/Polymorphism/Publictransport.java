package Polymorphism;

public class Publictransport {
	
	private void wheeler() {
		String trans="Honda bike";
		System.out.println(trans);
	}

	private void wheeler(String trans1) {
		System.out.println(trans1);
	}
	
	private void wheeler(String trans2, int a) {
		System.out.println(trans2+a);
	}
	
	private void wheeler(String trans3, String b, String c) {
		System.out.println(trans3+b+c);
	}
	public static void main(String[] args) {
		Publictransport pubtra=new Publictransport();
		pubtra.wheeler();
		pubtra.wheeler("BMW car");
		pubtra.wheeler("Bus", 32165498);
		pubtra.wheeler("Train",  "Flight",  "Ship");

	}

}
