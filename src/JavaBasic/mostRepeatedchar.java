package JavaBasic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class mostRepeatedchar {
	
	static char getMaxOccurringChar(String str) {
		if(str.length() == 0) {
			return  '0';
		}
		char[] c = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<>();
		for(char i : c) {
			if(charCount.containsKey(i)) {
				charCount.put(i, charCount.get(i) + 1);
			} else {
				charCount.put(i, 1);
			}
		}
		int maxCount = 0;
		Character repteatedChar = null;
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
			
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				repteatedChar = entry.getKey();
			}
		}
		System.out.println("After sorted: ");
		Stream<Map.Entry<Character, Integer>> sorted = charCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		sorted.forEach(System.out::println);
		return repteatedChar;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbccd";
        Character repteatedChar = getMaxOccurringChar(str);
        System.out.println("Most repeated character: " + repteatedChar);
        

	}

}
