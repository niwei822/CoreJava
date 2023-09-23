package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	/**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(i%3==0 && i%5==0) {
                ls.add("fizz buzz");
            } else if(i%3==0) {
                ls.add("fizz");
            } else if(i%5==0) {
                ls.add("buzz");
            } else {
                ls.add(Integer.toString(i));
            }
        }
        return ls;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
