package JavaBasic;

public class ThisDemo extends SuperDemo {
	int a=10;
	
	public ThisDemo() {
		System.out.println("child constructor");
	}
	public void getData() {
		int a=12;
		super.getData();
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public void getDataNow() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td=new ThisDemo();
		td.getData();
		td.getDataNow();

	}

}
