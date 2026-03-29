class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                sb.push(ch);
            }
            else if(!sb.isEmpty() && ch=='}' && sb.peek()=='{'){
                sb.pop();
            }
            else if(!sb.isEmpty() && ch==']' && sb.peek()=='['){
                sb.pop();
            }
            else if(!sb.isEmpty() && ch==')' && sb.peek()=='('){
                sb.pop();
            }
            else{
                return false;
            }
        }
        return sb.isEmpty();
        
    }
}
