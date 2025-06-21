class Solution {
    public static String build(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sc = new StringBuilder();
        for(int s:stack){
            sc.append(s);
        }
        return sc.toString(); 
    }
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}