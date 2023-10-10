package task4;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		int mrp=75;
		System.out.println("Cholate price is" +mrp);
		Scanner reference= new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=reference.nextInt();
		if (amt==mrp) {
			System.out.println("you buy a cholate and no return balance");
		}
		else if (amt>mrp) {
			int bal=amt-mrp;
			System.out.println("you buy a cholate and remaining balance is"+bal);
		}
		else {
			int remain=mrp-amt;
			System.out.println("pay the remaining balance amount"+remain);
		}

	}

}
