package Absrtraction;

import java.util.Scanner;

public class PassengerDetails implements Ticket{
	@Override
	public void train() {
		Scanner pnr= new Scanner(System.in);
		System.out.println("Enter the train number:");
		int trainno=pnr.nextInt();
		
		}
	@Override
	public void spare() {
		Scanner pri=new Scanner(System.in);
		System.out.println("Enter the Number of passengers");
		int amount=pri.nextInt();
		int price=250*amount;
		System.out.println("Total payment for train ticket:"+price);	
	}
	@Override
	public void date() {
		int day=02;
		int month=8;
		int year=2023;
		System.out.println("Passenger journey date: "+day+"-"+month+"-"+year);
	}
	@Override
	public void passenger() {
		String name1="Balaji";
		String name2="Renuka";
		String name3="Nayanika sree";
		String name4="Arunagiri";
		System.out.println("Passenger name:"+name1);
		System.out.println("Passenger name:"+name2);
		System.out.println("Passenger name:"+name3);
		System.out.println("Passenger name:"+name4);
	}
	
	public static void main(String[] args) {
	PassengerDetails pagde=new PassengerDetails();
	pagde.train();
	pagde.spare();
	pagde.date();
	pagde.passenger();
	}
}
