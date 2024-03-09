class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int sum = i;
            int rt = i + 1;
            while(sum < n){
                sum += rt;
                rt++;
            }
            if(sum == n) answer++;
        }
        return answer;
    }
}