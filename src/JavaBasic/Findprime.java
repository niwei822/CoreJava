package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class Findprime {
	
	/**
     * @param n: an integer
     * @return: return all prime numbers within n.
     */
    public List<Integer> prime(int n) {
        // write your code here
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=2;i<=n;i++) {
            if(isPrime(i)) {
                ls.add(i);
            }  
        }
        return ls;
    }
    public boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
