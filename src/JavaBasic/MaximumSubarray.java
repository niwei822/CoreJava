package JavaBasic;

public class MaximumSubarray {
	/*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
	
	public static int maxSubArray(int[] nums) {
		int maxSub = nums[0];
		int maxSum = 0;
		for(int num : nums) {
			maxSum += num;
			maxSub = Math.max(maxSum, maxSub);
			System.out.println(maxSub);
			if(maxSum < 0) {
				maxSum = 0;
			}
		}
		return maxSub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-5,4,-1,7,-8};
		System.out.println(maxSubArray(nums));
		
	}

}
