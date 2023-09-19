package JavaBasic;

public class isLeapYear {
	
	public boolean isLeapYear(int n) {
        // write your code here
        return n%4==0 && n%100!=0 || n%400==0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
