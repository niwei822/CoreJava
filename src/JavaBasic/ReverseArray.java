package JavaBasic;

public class ReverseArray {
	/**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        // write your code here
        int temp;
        for(int i=0;i<nums.length/2;i++) {
            temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
