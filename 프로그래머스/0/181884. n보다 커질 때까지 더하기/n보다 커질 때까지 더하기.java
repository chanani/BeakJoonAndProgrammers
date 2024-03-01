class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        while(answer <= n) answer += numbers[i++];
        return answer;
    }
}