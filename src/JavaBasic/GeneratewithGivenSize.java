package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class GeneratewithGivenSize {
	
	public List<Integer> generate(int size) {
        // write your code here
        List<Integer> a = new ArrayList<Integer>();
        for(int i=1;i<=size;i++) {
            a.add(i);
        }
        return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
