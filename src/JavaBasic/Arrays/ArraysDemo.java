package JavaBasic.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b[] = {1,2,3,4,5};
	
		for(int i=0;i<a.length;i++) {
			a[i] = i;
			//System.out.print(a[i]);
		}
		int c[][] = new int[2][3];
		c[0][0]=3;
		c[0][1]=4;
		c[0][2]=19;
		c[1][0]=2;
		c[1][1]=7;
		c[1][2]=10;
		int min = c[0][0];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(c[i][j]<min) {
					min=c[i][j];
				}
				
			}
		}
		System.out.println(min);
		
	}

}
