package JavaBasic;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("This is default constructor");
	}
	public ConstructorDemo(int a, int b) {
		System.out.println(a+b);
	}
	public ConstructorDemo(String str) {
		System.out.println("This is parameter constructor");
	}
	public void getData() {
		System.out.println("This is method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo x=new ConstructorDemo();
		ConstructorDemo y=new ConstructorDemo("hello");
		ConstructorDemo z=new ConstructorDemo(5,6);
		x.getData();
		z.getData();
		y.getData();

	}

}
