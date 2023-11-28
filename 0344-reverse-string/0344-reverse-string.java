class Solution {
    public void reverseString(char[] s) {
        int len = (int) Math.floor(s.length/2);
        for(int i=0;i<len;i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}