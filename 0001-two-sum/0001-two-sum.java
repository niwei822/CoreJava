class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i]) != null) {
                int[] res = {map.get(nums[i]), i};
                return res;
            }
            map.put(target - nums[i], i);
        }
        int[] res = {};
            return res;
    }
}