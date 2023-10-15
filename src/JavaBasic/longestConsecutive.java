package JavaBasic;

import java.util.Arrays;

public class longestConsecutive {
	public int longest_Consecutive(int[] nums) {
		Arrays.sort(nums);
		//[0,1,1,2,5]
        int count = 1;
        int temp = 0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1]-nums[i]==1) {
                count++;
            } else if(nums[i+1]!=nums[i]) {
            	temp = Math.max(temp, count);
				count = 1;
			}
        }
        return Math.max(temp, count);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 0, 1, 5, 3,-1};
		longestConsecutive l = new longestConsecutive();
		System.out.println(l.longest_Consecutive(nums));

	}

}
