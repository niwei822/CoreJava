package JavaBasic;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,6,4,9,7,5};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
			System.out.println(a[i]);

		}

	}

}
