package JavaBasic;

public class JavaBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		Methods m = new Methods();
		m.Hello();
		System.out.println(sum(10, 20));
		

	}
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
