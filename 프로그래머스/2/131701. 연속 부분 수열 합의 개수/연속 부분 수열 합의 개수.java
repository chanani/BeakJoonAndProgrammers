import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        for(int i = 1; i <= len; i++){
            int sum = 0, lt = 0;
            for(int j = 0; j < i; j++){
                sum += elements[j];
            }
            set.add(sum);
            for(int rt = i; rt < len + i - 1; rt++){
                sum += elements[rt % len];
                sum -= elements[lt++ % len];
                set.add(sum);
            }
            
        }
        
        answer = set.size();
        return answer;
    }
}