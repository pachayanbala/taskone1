package collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Treeset {
     public static void main(String[] args) {
		
    	 Map<Integer,String> e = new TreeMap<Integer,String>();
    	 e.put(0, null);
    	 e.put(1, "java");
    	 e.put(2, "don");
    	 e.put(3, "joke");
    	 e.put(4, "jery");
    	 e.put(5, "john");
    	 e.put(6, "jake");
    	 System.out.println(e);
    	 
    	 Set<Integer> s = e.keySet();
    	 System.out.println(s);
    	 
    	 Collection<String> s1 = e.values();
    	 System.out.println(s1);
    	 
    	 String s2 = e.get(0);
    	 System.out.println(s2);
    	 
    	 Set<Entry<Integer,String>> s3 = e.entrySet();
    	 for(Entry<Integer,String> d:s3) {
    		 System.out.println(d);
    	 }
	}
}
