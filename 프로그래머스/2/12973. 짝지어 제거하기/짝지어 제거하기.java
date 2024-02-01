import java.util.*;
class Solution{
    public int solution(String s){
        int answer = 1;
        Stack<Character> stack = new Stack<>();
        
        for(char x : s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == x){
                    stack.pop();
                } else{
                    stack.push(x);
                }
            } else{
                stack.push(x);
            }
        }
        
        if(!stack.isEmpty()) answer = 0;

        return answer;
    }
}