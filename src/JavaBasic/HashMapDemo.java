package JavaBasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	    HashMap<Integer, String> hm = new HashMap<Integer, String>();
	    hm.put(0, "hello");
	    hm.put(1, "world");
	    hm.put(2, "morning");
	    hm.put(3, "evening");

	    System.out.println(hm.get(2));
	    hm.remove(2);
	    hm.put(2, "morning");
	  //hashtable -pass table set collections 
	 // Get a Set of Map.Entry objects representing the entries in the HashMap.
	    //Set is used to obtain a collection of Map.Entry objects from the HashMap
	    Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
	 // Create an iterator to iterate over the entrySet.
	    Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();

	    while (iterator.hasNext()) {
	        Map.Entry<Integer, String> entry = iterator.next();
	        System.out.println("Key: " + entry.getKey());
	        System.out.println("Value: " + entry.getValue());
	    }
	}

}
