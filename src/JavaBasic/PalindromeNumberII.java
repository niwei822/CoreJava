package JavaBasic;

public class PalindromeNumberII {
	/*
	 * String a = Integer.toBinaryString(n); String b = new
	 * StringBuffer(a).reverse().toString(); return a.equals(b); Time
	 * Complexity:O(n) Space Complexity: O(n) because it creates a reversed copy of
	 * the binary string
	 */
	// O(n)&O(1)
	public boolean isPalindrome(int n) {
		String binaryString = Integer.toBinaryString(n); // Convert n to binary string
		int left = 0;
		int right = binaryString.length() - 1;

		// Compare characters from the beginning and end of the binary string
		while (left < right) {
			if (binaryString.charAt(left) != binaryString.charAt(right)) {
				return false; // If characters do not match, it's not a palindrome
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
