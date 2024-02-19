import java.util.*;
class Solution {
    public int solution(String s) {
        
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            Stack<String> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            String[] arr = str.split("");
            boolean ch = true;
            
            for(int j = 0; j < arr.length; j++){
                if(stack.isEmpty()){
                    if(arr[j].equals("]") || arr[j].equals(")") || arr[j].equals("}")){
                        ch = false;
                        break;
                    } else if(arr[j].equals("[") || arr[j].equals("(") || arr[j].equals("{")){
                        stack.push(arr[j]);
                    }
                } else{
                    if(arr[j].equals("[") || arr[j].equals("(") || arr[j].equals("{")){
                        stack.push(arr[j]);
                    } else{
                        if((arr[j].equals("]") && !stack.pop().equals("[")) ||
                          (arr[j].equals("}") && !stack.pop().equals("{")) || 
                          (arr[j].equals(")") && !stack.pop().equals("("))) {
                            ch = false;
                            break;
                        }
                    }
                }
            }
            
            if(ch && stack.isEmpty()) answer++;

        }
        
        
        return answer;
    }
}