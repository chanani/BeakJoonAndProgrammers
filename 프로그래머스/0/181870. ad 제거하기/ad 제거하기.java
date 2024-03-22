import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : strArr){
            if(!x.contains("ad")) answer.add(x);
        }
        return answer;
    }
}