package JavaBasic;

public class MakeFancyStr {
	/*A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

*/
	//Input: s = "aaabaaaa" Output: "aabaa"
	public static String makeFancyString(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				count++;
			} else {
				count=1;
			}
			if(count<3) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makeFancyString("leeetcode"));

	}

}
