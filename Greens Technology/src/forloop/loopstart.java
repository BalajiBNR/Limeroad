package forloop;

public class loopstart {

	static int row, colum;
	static void nestedfor() {
		for(row=1;row<=3;row++) {
			//1<=3 ---> true
			//2<=3---> true
			//3<=3---> true
			//4<=3---> true
			for(colum=1;colum<=3;colum++) {
				//1<=3---> true
				//2<=3---> true
				//3<=3---> true
				//4<=3---> false
				
				//1<=3---> true
				//2<=3---> true
				//3<=3---> true
				//4<=3---> false
				
				//1<=3---> true
				//2<=3---> true
				//3<=3---> true
				//4<=3---> false
				System.out.print(colum);
			}
			System.out.println();
		}
	}
	
	static void nested() {
		for(row=1;row<=3;row++) {
			//1<=3 ---> true
			//2<=3---> true
			//3<=3---> true
			//4<=3---> false
			for(colum=1;colum<=2;colum++) {
				//1<=3---> true
				//2<=3---> true
				//3<=3---> false
				
				//1<=3---> true
				//2<=3---> true
				//3<=3---> false
				
				System.out.print(colum);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// nestedfor();
		nested();

	}

}
