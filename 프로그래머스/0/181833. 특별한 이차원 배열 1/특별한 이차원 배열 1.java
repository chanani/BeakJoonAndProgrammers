class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n; i++){
            answer[i][i] = 1;
            for(int j = 0; j < n; j++){
                if(answer[i][j] != 1) answer[i][j] = 0;
            }
        }
        return answer;
    }
}