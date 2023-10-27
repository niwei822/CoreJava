package JavaBasic.Grind75questions;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	/*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
         numbers=[2, 7, 11, 15],  target=9
         return [1, 2]
     */
	 public static int[] twoSum(int[] numbers, int target) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i=0;i<numbers.length;i++) {
			 if(map.get(numbers[i]) != null) {
				 int[] res = {map.get(numbers[i]), i};
				 System.out.println(Arrays.toString(res));
				 return res;
			 }
			 map.put(target - numbers[i], i);
		 }
		 int res[] = {};
		 return res;
	
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {15,2,7,11};
		
		System.out.println(Arrays.toString(twoSum(numbers, 9)));
		

	}

}
