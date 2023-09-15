package JavaBasic;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 3, 2, 5, 6, 7, 2, 6, 5, 2, 9 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] == a[i]) {
						k++;
					}
				}
				//System.out.println(a[i]);
				//System.out.println(k);
				if (k == 1) {
					System.out.println(a[i] + " is unique number.");
				}
			}
		}

	}

}
