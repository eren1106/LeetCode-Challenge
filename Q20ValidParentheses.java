class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if(c == ')' && pop != '(') return false;
                if(c == ']' && pop != '[') return false;
                if(c == '}' && pop != '{') return false;
            }
        }
        
        return stack.isEmpty();
    }
}