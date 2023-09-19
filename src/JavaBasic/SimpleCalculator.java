package JavaBasic;

public class SimpleCalculator {
	
	public static int calculate(int a, char operator, int b) {
		switch(operator) {
		case '+': return a + b;
		case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate(2,'+',3));

	}

}
