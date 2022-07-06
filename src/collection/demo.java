package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> e = new HashMap<Integer,String>();
		
		e.put(null, null);
		e.put(1, "cats");
		e.put(2, "cats");
		e.put(3, "dog");
		e.put(4, "mary");
		e.put(5, "joke");
		e.put(6, "jhon");
		e.put(7, "jack");
		System.out.println(e);
		
		Set<Integer> s = e.keySet();
		System.out.println(s);
		
		  String s1 = e.get(4);
		  System.out.println(s1);
		  
		  Collection<String> s2 = e.values();
		  System.out.println(s2);
		  
		  Set<Entry<Integer,String>> s3 = e.entrySet();
		  for(Entry<Integer,String> d:s3) {
			  System.out.println(d);
		  }
	}

}
