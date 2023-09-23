package JavaBasic;

import java.util.Arrays;

public class RotateArray {
	
	  public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        if (n == 0 || k % n == 0) {
	            return; // No rotation needed
	        }

	        k %= n; // Ensure k is within the range of array length

	        // Reverse the entire array
	        reverse(nums, 0, n - 1);
	        // Reverse the first part from 0 to k - 1
	        reverse(nums, 0, k - 1);
	        // Reverse the second part from k to n - 1
	        reverse(nums, k, n - 1);
	    }

	    // Helper function to reverse a portion of the array
	    private static void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5};
	        int k = 2;
	        rotate(nums, k);
	        System.out.println(Arrays.toString(nums));
	    }

}
