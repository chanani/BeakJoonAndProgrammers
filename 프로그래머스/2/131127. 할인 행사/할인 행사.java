import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
       int answer = 0, lt = 0;
        Map<String, Integer> req = new HashMap<>();
        Map<String, Integer> res = new HashMap<>();
        for(int i = 0; i < want.length; i++) req.put(want[i], number[i]);

        for(int i = 0; i < 10; i++) res.put(discount[i], res.getOrDefault(discount[i], 0) + 1);
        
        if(ch(req, res, want)) answer++;

        for(int rt = 10; rt < discount.length; rt++){
            res.put(discount[rt], res.getOrDefault(discount[rt], 0) + 1);
            res.put(discount[lt], res.get(discount[lt++]) - 1);
            if(ch(req, res, want)) answer++;
        }

        return answer;
    }
    
    public static boolean ch(Map<String, Integer> req, Map<String, Integer> res, String[] want){
        boolean result = true;
        for(int i = 0; i < want.length; i++){
            if(req.get(want[i]) != res.getOrDefault(want[i], 0)) {
                result = false;
                break;
            }
        }
        return result;
    }
}