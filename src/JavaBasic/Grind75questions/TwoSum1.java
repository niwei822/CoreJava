package JavaBasic.Grind75questions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
	
	 public int[] TwoSum(int[] numbers, int target) {
		 //create a hash map to store number and its index
		 //loop through numbers, create key value pair of opposite number(target-current num, index)
		 //if also found current number in map, means find a pair
		 //then create an integer array to store index of the pair
		 //if no pair found, return empty array
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i=0;i<numbers.length;i++) {
			 if(map.get(numbers[i]) != null) {
				 int[] res = {map.get(numbers[i]), i};
				 return res;
			 }
			 map.put((target - numbers[i]), i);
		 }
		 int[] res = {};
		 return res;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum1 ts = new TwoSum1();
		int[] numbers = {15,2,7,11};
		
		System.out.println(Arrays.toString(ts.TwoSum(numbers, 9)));

	}

}
