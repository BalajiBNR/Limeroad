package Hierarchical;

import java.util.Scanner;

public class SBI extends RBI{
	
	public static void Credit() {
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the bank account number");
		int next=scan2.nextInt();
		System.out.println("Your are eligible for credit card"+scan2);
	}

	public static void main(String[] args) {
		Approval();
		Credit();

	}

}
