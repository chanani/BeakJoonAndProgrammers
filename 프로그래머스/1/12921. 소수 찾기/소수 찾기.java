class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] check = new int[n + 1];
        
        for(int i = 2; i <= n; i++){
            if(check[i] == 0){
                answer++;
                for(int j = i; j <= n; j += i){
                    check[j] = 1;
                }
            }
        }
        
        
        return answer;
    }
}