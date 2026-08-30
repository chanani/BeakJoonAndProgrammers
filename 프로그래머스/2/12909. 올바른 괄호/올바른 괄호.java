import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<String> stack = new ArrayDeque<>();
        
        for(String str : s.split("")) {
            if(str.equals("(")) {
                stack.push(str);
            } else {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        
        return !stack.isEmpty() ? false : true;
    }
}