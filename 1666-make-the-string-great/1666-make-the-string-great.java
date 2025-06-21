class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char a : stack){
            sb.append(a);
        }
        return sb.toString();
    }
}