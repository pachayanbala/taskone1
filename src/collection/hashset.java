package collection;



import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashset {
   public static void main(String[] args) {
	
	   Map<Integer,String> e= new LinkedHashMap<Integer,String>();
	   
	   e.put(null, null);
	   e.put(1, "hai");
	   e.put(2, "his");
	   e.put(3, "him");
	   e.put(4, "don");
	   e.put(5, "low");
	   e.put(6, "high");
	   System.out.println(e);
	   
	   String s = e.get(3);
	   System.out.println(s);
	   
	   Set<Integer> s1 = e.keySet();
	   System.out.println(s1);
	   
	   Collection<String> s2 = e.values();
	   System.out.println(s2);
	   
	   boolean w = e.containsKey(7);
	   System.out.println(w);
	   
	   Set<Entry<Integer,String>> s3 = e.entrySet();
	   for(Entry<Integer,String> d:s3) {
		   System.out.println(d);
	   }
}
}
