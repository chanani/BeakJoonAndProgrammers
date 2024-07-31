import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            int temp = Integer.parseInt(intStrs[i].substring(s,s + l));
            if(temp > k) {
                list.add(temp);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}