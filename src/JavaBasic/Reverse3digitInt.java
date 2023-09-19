package JavaBasic;

public class Reverse3digitInt {
	public static int reverseInteger(int number) {
		// write your code here
		/*
		 * String num=String.valueOf(number); String newStr=""; for(int
		 * i=num.length()-1;i>=0;i--) { newStr += num.charAt(i); } return
		 * Integer.parseInt(newStr);
		 */

		int num1 = number % 10;
		int num2 = number / 10 % 10;
		int num3 = number / 10 / 10;
		return num1 * 100 + num2 * 10 + num3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = reverseInteger(900);
		System.out.println(a);

	}

}
