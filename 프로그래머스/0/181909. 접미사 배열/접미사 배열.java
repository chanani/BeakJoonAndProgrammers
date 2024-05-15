import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        int leng = my_string.length();
        String[] answer = new String[leng];
        
        for(int i = leng - 1; i >= 0; i--){
            answer[i] = my_string.substring(i, leng);
        }
        Arrays.sort(answer);
        return answer;
    }
}