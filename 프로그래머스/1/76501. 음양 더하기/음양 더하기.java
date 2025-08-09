class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            if(signs[i]){
                answer = answer += absolutes[i];
                continue;
            }
            answer = answer -= absolutes[i];
        
        }
        return answer;
    }
}