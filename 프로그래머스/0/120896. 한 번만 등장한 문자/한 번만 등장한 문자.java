import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : map.keySet()){
            if(map.get(x) == 1) answer += x;
        }
        return answer;
    }
}