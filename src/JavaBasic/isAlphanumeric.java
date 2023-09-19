package JavaBasic;

public class isAlphanumeric {
	
	public static boolean isAlphanumeric(char c) {
        // write your code here
        return ('0'<=c && c<='9') || ('A'<=Character.toUpperCase(c) && Character.toUpperCase(c)<='Z');
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAlphanumeric('1');

	}

}
