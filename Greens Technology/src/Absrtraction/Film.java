package Absrtraction;

public class Film extends Cinema{

	@Override
	void tamilCinema() {
		System.out.println("Kollywood");
		
	}

	@Override
	void teluguCinema() {
		System.out.println("Tollywood");
		
	}
	public static void main(String[] args) {
		Film fg=new Film();
		fg.tamilCinema();
		fg.teluguCinema();
		fg.hindiCinema();

	}

	

}
