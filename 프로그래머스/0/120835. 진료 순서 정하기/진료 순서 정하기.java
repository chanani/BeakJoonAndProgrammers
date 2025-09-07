import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] sorted = Arrays.stream(emergency)
                                 .boxed()
                                 .sorted(Comparator.reverseOrder())
                                 .toArray(Integer[]::new);
        
        int[] answer = new int[emergency.length];
        
         Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], i + 1); 
        }
        
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }
        
        return answer;
    }
}