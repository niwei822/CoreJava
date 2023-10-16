package JavaBasic;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {
	
	public static String findMostRepeatedWord(String sentence) {
		String[] words = sentence.replaceAll("\\p{Punct}", "").split("\\s+");
		Map<String, Integer> wordCount = new HashMap<>();
		for(String word : words) {
			word = word.toLowerCase();
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		int max_count = 0;
		String mostRepeatedWord = null;
		for(Map.Entry<String, Integer> entry: wordCount.entrySet()) {
			if(entry.getValue() > max_count) {
				max_count = entry.getValue();
				mostRepeatedWord = entry.getKey();
			}
		}
		return mostRepeatedWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a a sample sample sentence sample. This is sample.";
        String mostRepeatedWord = findMostRepeatedWord(sentence);
        System.out.println("Most repeated word: " + mostRepeatedWord);

	}

}
