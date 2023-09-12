package JavaBasic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//random order
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("hello");
		hs.add("abc");
		System.out.println(hs);
		//hs.remove("abc");
		hs.isEmpty();
		System.out.println(hs.size());
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
