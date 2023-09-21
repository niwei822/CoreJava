package JavaBasic;

public class MaxofArray {
	public float maxOfArray(float[] a) {
        // write your code here
        float maxnum = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]>maxnum) {
                maxnum = a[i];
            }
        }
        return maxnum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
