package JavaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	//Count the number of names starting with alphabet A in list
		public static void regular()
		{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Dee");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Rama");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}

		System.out.println(count);	
		//lambda expression
		long c=names.stream().filter(s->s.startsWith("D")).count();
		System.out.println(c);
	
		//print all names from arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//map
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> words=Arrays.asList("aello","aold","hike","abc","zoo");
		words.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		//merging 2 lists
		Stream<String> newStream=Stream.concat(names.stream(), words.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("abc"));
		System.out.println(flag);
		
		//collect
		List<String> ls=Stream.of("aello","aold","hike","abc","zoo").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		//print unique number from array
		List<Integer> nums=Arrays.asList(1,2,2,3,4,1,6,6,6,4);
		nums.stream().distinct().forEach(s->System.out.println(s));
		
		//sort array and 3rd index
		List<Integer> li=nums.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		}
		Should I don't know Doja play one
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			regular();

		}

}
