package JavaBasic;

public class MaximumSubarray {
	/*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
	
	public static int maxSubArray(int[] nums) {
		int maxSub = nums[0];
		int sum = 0;
		for(int num : nums) {
			sum += num;
			maxSub = Math.max(sum, maxSub);
			if(sum < 0) {
				sum = 0;
			}
		}
		return maxSub;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
		
	}

}
