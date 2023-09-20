package JavaBasic;

import java.util.List;

public class Findmaximum {
	
	public int maxNum(List<Integer> nums) {
        // write your code here
        int maxNum=nums.get(0);
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i) > maxNum) {
                maxNum = nums.get(i);
            }
        }
        return maxNum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
