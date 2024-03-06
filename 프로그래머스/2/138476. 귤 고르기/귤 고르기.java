import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        for(int key : map.keySet()) Q.offer(map.get(key));
        
        while (k > 0){
            if(Q.peek() > k){
                Q.poll();
                answer++;
                break;
            } else {
                k -= Q.poll();
                answer++;
            }
        }
        
        return answer;
    }
}