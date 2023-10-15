package JavaBasic;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// can accept duplicate values
		//ArraList,LinkedList,vector- Implementing List interface
		//array have fixed size where as arraylist can grow dynamicaly
		//you can access and insert any value in any index
		ArrayList<String> a=new ArrayList<String>();
		a.add("abc");
		a.add("def");
		a.add("ghi");
		System.out.println(a);
		a.add(0, "hello");
		System.out.println(a);
		/*a.remove(1);
		a.remove("java");
		System.out.println(a);*/
		System.out.println(a.get(2));
		// testing
		System.out.println(a.contains("abc"));
		System.out.println(a.indexOf("def"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}


