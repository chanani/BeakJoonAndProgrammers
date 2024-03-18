import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> Q = new LinkedList<>();
        for(int x : prices) Q.offer(x);
        int index = 0;
        while(!Q.isEmpty()){
            int target = Q.poll();
            for(int x : Q){
                answer[index]++;
                if(target > x) break;
            }
            index++;
        }
        return answer;
    }
}