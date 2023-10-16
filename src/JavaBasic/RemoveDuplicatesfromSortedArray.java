package JavaBasic;

public class RemoveDuplicatesfromSortedArray {
	/*
     * @param nums: An integer array
     * @return: An integer
     * [1,1,2,2,3,4]
     */
	
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		if(len==0 || len==1) {
			return len;
		}
		int j = 0;
		for(int i=0;i<len;i++) {
			// If the current element is different from the element at 
			//position j in the modified array.
			if(nums[i]!=nums[j]) {
				// Increment j by 1, then assign the current element to
				//the new position in the modified array.
				nums[++j] = nums[i];
			}
		}
		return j + 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedArray rd = new RemoveDuplicatesfromSortedArray();
		int[] nums = {1,1,2,2,3,4};
		System.out.println(rd.removeDuplicates(nums));
	}

}
