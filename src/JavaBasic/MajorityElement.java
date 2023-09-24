package JavaBasic;

import java.util.List;

public class MajorityElement {
	
	public int majorityNumber(List<Integer> nums) {
		//{1,1,2,2,2}
	    int candidate = 0; // Initialize to any default value (since it will change).
	    int count = 0;

	    // Iterate through the list.
	    for (int num : nums) {
	        if (count == 0) {
	            // If the count is 0, set the current number as the potential candidate.
	            candidate = num;
	            count = 1;
	        } else if (candidate == num) {
	            // If the current number matches the candidate, increment the count.
	            count++;
	        } else {
	            // If the current number is different from the candidate, decrement the count.
	            count--;
	        }
	    }

	    // After the loop, 'candidate' holds the potential majority element.
	    // Now, we need to verify if it occurs more than half of the list.
	    count = 0;
	    for (int num : nums) {
	        if (num == candidate) {
	            count++;
	        }
	    }

	    if (count > nums.size() / 2) {
	        return candidate; // The candidate is the majority element.
	    } else {
	        return -1; // There is no majority element.
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
