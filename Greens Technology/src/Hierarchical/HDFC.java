package Hierarchical;

import java.util.Scanner;

public class HDFC extends RBI {
	
	public static void Credit() {
		Scanner scan3=new Scanner(System.in);
		System.out.println("Enter the bank account number");
		int next=scan3.nextInt();
		System.out.println("Your are eligible for credit card"+scan3);
	}


	public static void main(String[] args) {
		Approval();
		Credit();

	}

}
