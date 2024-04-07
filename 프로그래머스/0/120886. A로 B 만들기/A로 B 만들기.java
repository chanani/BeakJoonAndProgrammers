import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        Map<Character, Integer> b = new HashMap<>();
        Map<Character, Integer> a = new HashMap<>();
        for(int i = 0; i < before.length(); i++){
            b.put(before.charAt(i), b.getOrDefault(before.charAt(i), 0) + 1);
            a.put(after.charAt(i), a.getOrDefault(after.charAt(i), 0) + 1);
        }
        for(char x : b.keySet()){
            if(a.get(x) != b.get(x)) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}