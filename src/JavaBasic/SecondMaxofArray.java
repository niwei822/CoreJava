package JavaBasic;

public class SecondMaxofArray {
	
	public int secondMax(int[] nums) {
        // write your code here
        int temp;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]>nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[nums.length-2];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
