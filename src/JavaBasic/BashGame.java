package JavaBasic;

public class BashGame {
	
	public static boolean canWinBash(int n) {
        // Write your code here
        return n%4!=0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canWinBash(5));

	}

}
