class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        for(int i=0; i<share; i++){
            answer *= (balls - i); // 분자 : n부터 n-m+1까지 나눔
            answer /= (i + 1); // 분모 : 1부터 m까지를 나눔
        }
        
        return answer;
    }
}
