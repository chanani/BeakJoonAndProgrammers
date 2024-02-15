class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        // n : 참가자 수, a : 참가자, b : 경쟁자
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
    
        return answer;
    }
}