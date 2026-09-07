import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
            int price = prices[i];
            while(!stack.isEmpty() && stack.peek()[0] > price) {
                int[] cur = stack.pop();
                int cp = cur[0];
                int ci = cur[1];
                answer[ci] = i - ci;
            }
            
            stack.push(new int[]{prices[i], i});
        }
        
        while(!stack.isEmpty()) {
            int[] cur = stack.pop();
            int cp = cur[0];
            int ci = cur[1];
            answer[ci] = n - 1- ci;
        }
        
        return answer;
    }
}