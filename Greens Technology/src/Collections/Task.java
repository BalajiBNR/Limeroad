package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner duplicate=new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS:");
		int next=duplicate.nextInt();
		int array[]=new int[next];
		
		Scanner user=new Scanner(System.in);
		System.out.println("User input the Array values:");
		
		for(int i=0;i<array.length;i++) {
			array[i]=user.nextInt();
		}
		ArrayList <Object> list=new ArrayList<>();
		ArrayList <Object> list1=new ArrayList<>();
		for(int us:array) {
			list.add(us);
			list1.add(us);

		}
		System.out.println("Array Duplicate Values:"+list);
        list1.retainAll(list);
		System.out.println("Array Duplicate Values:"+list1);
	
			if(list==list1) {
			
			System.out.println(list1);
			}
	}

}
