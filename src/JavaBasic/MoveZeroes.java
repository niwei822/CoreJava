package JavaBasic;

public class MoveZeroes {
	
	/**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {
        //将两个指针先指向数组头部
        int left = 0, right = 0;
        while (right < nums.length) {
            // 遇到非0数赋值给新数组指针指向的位置
            if (nums[right] != 0) {
                nums[left] = nums[right];
                // 将left向后移动一位
                left++;
            }
            right++;
        }
        // 若新数组指针还未指向尾部，将剩余数组赋值为0
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
        int left =0;
        for(int right=0;right<nums.length;right++) {
            if(nums[right]!=0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }  
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
