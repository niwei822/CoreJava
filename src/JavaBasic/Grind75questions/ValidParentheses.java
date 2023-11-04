package JavaBasic.Grind75questions;

import java.util.Stack;

public class ValidParentheses {
	
	 /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
    	//create stack to store Parentheses
    	//loop through s converted char array, if it's front parentheses then push to stack
    	//if it's back and stack is not empty, check if it matches corresponding front
    	//if matches, pop the front parentheses
    	//if back parentheses appears first then return false
    	//at the end, if all matches the stack should be empty
    	Stack<Character> p = new Stack<Character>();
    	for(Character c : s.toCharArray() ) {
    		if("({[".contains(c.toString())) {
    			p.push(c);
    		} else if(!p.isEmpty() && isValid(p.peek(), c)) {
    			p.pop();
    		}
    		else {
    			return false;
    		}
    	}
    	return p.isEmpty();
    }
    	private boolean isValid(char c1, char c2) {
    		return (c1=='('&&c2==')' || c1=='{'&&c2=='}' || c1=='['&&c2==']');
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValidParentheses("()[){}"));
	}

}
