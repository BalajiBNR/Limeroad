package controlstatement;

public class Simple {

	static int g=10;
	static void varityAmark() {
		int b=25;
		System.out.println(b+g);
	}
	
	static int mark=70;
	static int expected=60;
	static void mark() {
		if (mark>=expected) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	
	int tamil = 75;
	int english=56;
	int math=68;
	int science=25;
	int social=40;
	void examresult() {
		if (tamil>=40 && english>=40 && math>=40 && science>=40 && social>=40) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	public static void main(String[] args) {
	varityAmark();
	mark();
	Simple simp = new Simple();
	simp.examresult();
	


	}
	
	
			}
