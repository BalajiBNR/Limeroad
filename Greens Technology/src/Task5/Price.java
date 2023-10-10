package Task5;

import java.util.Scanner;

public class Price extends Products{
	
	public static void mrp(){
		int rate=65;
		int Totalamt=pro*rate;
		Scanner pri=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int rupees=pri.nextInt();
		
		if (Totalamt==rupees) {
			System.out.println("you buy a mango fruit and no return balance");
		}
		else if (rupees>Totalamt) {
			int bal=rupees-Totalamt;
			System.out.println("you buy a mango fruit and remaining balance is"+bal);
		}
		else {
			int remain=Totalamt-rupees;
			System.out.println("pay the remaining balance amount"+remain);
		}
		
	}

	public static void main(String[] args) {
		fruits();
		mrp();

	}

}
