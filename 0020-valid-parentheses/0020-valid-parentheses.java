class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()) {
            if("({[".contains(c.toString())) {
                stack.push(c);
            } else if(!stack.isEmpty() && verify(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }  
        return stack.isEmpty();      
    }
    private boolean verify(char c1, char c2) {
        return (c1=='('&&c2==')' || c1=='{'&&c2=='}' || c1=='['&&c2==']');
    }
}