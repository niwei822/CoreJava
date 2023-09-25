package JavaBasic;

public class ReverseWords {
	
	/**
     * @param s: A string
     * @return: A string
     */
    public static String reverseWords(String s) {
        // write your code here
    	String[] a=s.trim().split("\\s+");
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=a.length-1;i>=0;i--) {
    		sb.append(a[i]);
    		if(i>0) {
    			sb.append(" ");
    		}
    	}
    	
    	return sb.toString();

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("  hello world I am happy  "));

	}

}
