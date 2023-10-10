package casting;

public class Whileloop {

	

	public static void main(String[] args) {
	
		int num=11221;
		int temp=num;
		int reverse=0;
		while(num>0) {
			int remainder=num%10;
			reverse=reverse*10 + remainder;
			num/=10;
		}
		if(temp==reverse) {
			System.out.print("Palendrome");
		}
		 else {
			 System.out.println("Not a palendrome");
		 }
			

	}

}
