package JavaBasic;

import java.util.Arrays;

public class CalculateCircumferenceArea {
	public static double[] calculate(int r) {
        // write your code here
        double[] nums=new double[2];
        nums[0]=3.14*r*2;
        nums[1]=3.14*r*r;
        return nums;    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = calculate(4);
		System.out.println(Arrays.toString(a));
	}

}
