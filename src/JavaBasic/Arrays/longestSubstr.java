package JavaBasic.Arrays;

public class longestSubstr {
	/**
     * @param s: a string
     * @return: an integer 
     */
	
	public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256]; // map from character's ASCII to its last occured index
        
        int j = 0;
        int i = 0;
        int ans = 0;
        for (i = 0; i < s.length(); i++) {
            while (j < s.length() && map[s.charAt(j)]==0) {
                map[s.charAt(j)] = 1;
                ans = Math.max(ans, j-i + 1);
                j ++;
            }
            map[s.charAt(i)] = 0;
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
