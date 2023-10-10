package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Excercise {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(1000);
		list.add(1500);
		list.add(2000);
		list.add(2500);
		list.add(3000);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(4));
		list.set(2, null);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		List<Object> list1=new LinkedList<>();
		list1.add("Sports"); list1.add(2500); list1.add(165324.56);
		list1.add("Basketball"); list1.add(null); list1.add("Soccer");
		System.out.println(list1);
		list1.addAll(list);
		System.out.println(list1);
		list1.retainAll(list);
		System.out.println(list1);
		list1.removeAll(list);
		System.out.println("RemoveAll"+list1);
	}

}
