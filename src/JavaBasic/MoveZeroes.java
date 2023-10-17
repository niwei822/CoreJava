package JavaBasic;

public class MoveZeroes {
	
	/**
     * @param nums an integer array
     * @return nothing, do this in-place
     * [0,1,0,3,12]
     */
    
	public static void moveZeroes(int[] nums) {
		int left = 0;
		for(int right=0;right<nums.length;right++) {
			int temp;
			if(nums[right]!=0) {
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for(int num: nums) {
			System.out.println(num);
		}
		

	}

}
