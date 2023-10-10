package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapexample {

	public static void main(String[] args) {
		Map<String,Integer> user=new HashMap<>();
		System.out.println(user);
		user.put("Arun", 9638520);
		user.put("Balaji", 9638521);
		user.put("Renuka", 9638522);
		user.put("Nayanika sree", 9638523);
		System.out.println(user);
		Set<String> key=user.keySet();
		System.out.println(key);
		Collection<Integer> values=user.values();
		System.out.println(values);
		Set<Entry<String,Integer>> entryset=user.entrySet();
		System.out.println(entryset);
		for(Entry<String,Integer> entry:entryset) {
			System.out.println(entry);
		}
	}

}
