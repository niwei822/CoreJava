package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class YangHuiTriangle {

	/**
	 * @param n: a Integer
	 * @return: the first n-line Yang Hui's triangle
	 */
	public static List<List<Integer>> calcYangHuisTriangle(int n) {
		// write your code here
		// each row is list of integers
		List<List<Integer>> ll = new ArrayList<>();
		if (n <= 0) {
			return ll;
		}
		// generate each row of Pascal's triangle
		for (int i = 0; i < n; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				// inner loop is responsible for generating the individual elements of
				// the current row
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					// Calculate the value using the previous row
					List<Integer> prevRow = ll.get(i - 1);
					int val = prevRow.get(j - 1) + prevRow.get(j);
					row.add(val);
				}
			}
			ll.add(row);
			System.out.println(row);
		}
		return ll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		calcYangHuisTriangle(n);
		
	}

}
