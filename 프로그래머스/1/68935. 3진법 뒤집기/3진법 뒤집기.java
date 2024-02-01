import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] arr = Integer.toString(n, 3).split("");
        String str = "";
        for(int i = arr.length - 1; i >= 0; i--){
            str += arr[i];
        }
        String x = Integer.toString(Integer.parseInt(str, 3));
        answer = Integer.parseInt(x);
        return answer;
    }
}