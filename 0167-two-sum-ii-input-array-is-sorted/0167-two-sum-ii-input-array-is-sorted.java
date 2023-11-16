class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int[] res = {map.get(numbers[i]) + 1, i + 1};
                //System.out.println(Arrays.toString(res));
                return res;
            }
            map.put(target - numbers[i], i);
            
        }
        // If no solution is found, return an empty array
        int[] res = {};
        //System.out.println(Arrays.toString(res));
        return res;
    }
}