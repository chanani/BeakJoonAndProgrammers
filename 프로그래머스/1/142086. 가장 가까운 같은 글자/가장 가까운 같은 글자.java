import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] word = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length; i++){
            if(map.get(word[i]) == null){
                answer[i] = -1;
                map.put(word[i], i);
            } else {
                answer[i] = i - map.get(word[i]);
                map.put(word[i], i);
            }
        }
        return answer;
    }
}