class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<c.length()/2;i++) {
            if(c.charAt(i) != c.charAt(c.length() - 1 - i)) {
                return false;
            }
        } 
        return true;
    }
}