import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[1] = 1;
        Set<String> set = new HashSet<>();
        
        int i = 0, j = 0;
        String first = "";
        String last = "";
        while(j < words.length){
            String text = words[j];
            first = text.substring(0, 1);
            boolean result = set.add(text);
            if(!result || (!last.equals("") && !first.equals(last))){
                answer[0] = i + 1;
                break;
            }
            
            i++;
            j++;
            if(i == n) {
                i = 0;
                answer[1]++;
            }
            last = text.substring(text.length() - 1, text.length());

        }
        
        if(answer[0] == 0) answer[1] = 0;
        return answer;
    }
}