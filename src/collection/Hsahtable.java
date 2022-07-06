package collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hsahtable {
	
	public static void main(String[] args) {
		
		Map<Integer,String> e = new Hashtable<Integer,String>();
		
		e.put(0, "null");
		e.put(1, "java");
		e.put(2, "joke");
		e.put(3, "jake");
		e.put(4, "jhon");
		e.put(5, "jery");
		e.put(6, "japan");
		e.put(6, "japan");
		System.out.println(e);
		
		Set<Integer> s = e.keySet();
		System.out.println(s);
		
		Collection<String> s1 = e.values();
		System.out.println(s1);
		
		String s2 = e.get(4);
		System.out.println(s2);
		
		Set<Entry<Integer,String>> s3 = e.entrySet();
		for(Entry<Integer,String> d :s3) {
			System.out.println(d);
		}
	}

}
