class Solution {
    public int solution(int[][] sizes) {
        int max_row = 0; //가로의 최대 길이
        int max_col = 0; // 세로의 최대 길이
        
        for(int i = 0; i < sizes.length; i++){ //긴 부분을 가로로 재배치
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(max_row < sizes[i][0]) max_row = sizes[i][0]; // 최대값
            if(max_col < sizes[i][1]) max_col = sizes[i][1]; // 최대값
        }
        
        return max_col * max_row;
    }
}