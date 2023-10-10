package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapTaskQuestion1 {

	public static void main(String[] args) {
		Map<Integer,String> hashmap=new HashMap<>();
		hashmap.put(10,"java");
		hashmap.put(20,"sql");
		hashmap.put(30,"oops");
		hashmap.put(40,"Sql");
		hashmap.put(50,"oracle");
		hashmap.put(60,"DB");
		hashmap.put(10,"selenium");
		hashmap.put(50,"psql");
		hashmap.put(40,"Hadoop");
		System.out.println("Hashmap created these key and values:");
		System.out.println(hashmap);
		System.out.println();
		
		
		Map<Integer,Integer> linkmap=new LinkedHashMap<>();
		linkmap.put(10,10);
		linkmap.put(20,20);
		linkmap.put(30,30);
		linkmap.put(40,40);
		linkmap.put(50,50);
		linkmap.put(60,60);
		linkmap.put(10,10);
		linkmap.put(50,50);
		linkmap.put(40,40);
		System.out.println("LinkedHashmap created these key and values:");
		System.out.println(linkmap);
		System.out.println();

		Map<Object,Integer> treemap=new TreeMap<>();
		treemap.put('!',10);
		treemap.put('@',20);
		treemap.put('#',30);
		treemap.put('$',40);
		treemap.put('%',50);
		treemap.put('^',60);
		treemap.put('&',10);
		treemap.put('*',50);
		treemap.put('(',40);
		System.out.println("Treemap created these key and values:");
		System.out.println(treemap);
		System.out.println();
		
		Map<String,String> hashtable=new Hashtable<>();
		hashtable.put("vel","Selenium");
		hashtable.put("Ganesh","framework");
		hashtable.put("Dinesh","oracle");
		hashtable.put("venkat","corejava");
		hashtable.put("subash","jira");
		System.out.println("HashTable created these key and values:");
		System.out.println(hashtable);
		System.out.println();
		
	}


	

}
