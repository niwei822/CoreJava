package JavaBasic;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		String reversed= "";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=(str.charAt(i));
		}
		System.out.println(reversed);
	}
}
