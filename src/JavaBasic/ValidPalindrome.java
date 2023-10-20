package JavaBasic;

public class ValidPalindrome {
	 /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if(s == null || s.length() == 0) {
            return true;
        }
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<c.length()/2;i++) {
            if(c.charAt(i) != c.charAt(c.length()-1-i)) {
                return false;
            }
        }
        return true;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
