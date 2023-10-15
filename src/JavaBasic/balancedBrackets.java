package JavaBasic;

import java.util.Stack;

public class balancedBrackets {
	 /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public static boolean isValidParentheses(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(Character c:s.toCharArray()) {
    		if("({[".contains(c.toString())) {
    			stack.push(c);
    		} else if(!stack.isEmpty()&&isMatched(stack.peek(),c)) {
				stack.pop();
			} else {
				return false;
			}
    	}
		return stack.isEmpty();
    }
	private static boolean isMatched(char a,char b) {
		return (a=='('&&b==')')||(a=='['&&b==']')||(a=='{'&&b=='}');
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidParentheses("({)"));

	}

}
