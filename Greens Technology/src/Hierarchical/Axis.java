package Hierarchical;

import java.util.Scanner;

public class Axis extends RBI{
	
	public static void Credit() {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the bank account number");
		int next=scan1.nextInt();
		System.out.println("Your are eligible for credit card"+scan1);
		
	}

	public static void main(String[] args) {
		Approval();
		Credit();

	}

}
