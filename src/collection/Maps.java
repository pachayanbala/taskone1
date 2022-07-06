package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	
	public static void main(String[] args) {
		
		Map <Integer,String> e = new HashMap<Integer,String>();
		e.put(1, "hi");
		e.put(2, "him");
		e.put(4, "her");
		e.put(5, "has");
		e.put(6, "had");
		e.put(7, "his");
		e.put(7, "hi");
		System.out.println(e);
		String s=e.get(6);
		System.out.println(s);
		
		Set<Integer> s1 = e.keySet();
		System.out.println(s1);
		
		Collection<String> s2 = e.values();
		System.out.println(s2);
		
		Set<Entry<Integer,String>> s3 = e.entrySet();
		for(Entry<Integer,String> t:s3) {
			System.out.println(t);
		}
	}

}
