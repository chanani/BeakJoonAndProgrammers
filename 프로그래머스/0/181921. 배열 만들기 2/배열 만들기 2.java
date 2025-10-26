import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
              
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            String str = i + "";
            int cnt = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '0' || str.charAt(j) == '5') {
                    cnt ++;
                }
            }
            if(cnt == str.length()) {
                al.add(i);
            }
        }
        
        int[] answer = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        
        return answer;

    }
}