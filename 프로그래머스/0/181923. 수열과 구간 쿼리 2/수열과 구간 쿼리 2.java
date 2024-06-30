class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int max = Integer.MAX_VALUE;
            boolean result = false;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    max = Math.min(max, arr[j]);
                    result = true;
                }
            }
            if(!result) {
                answer[i] = -1;
            } else {
                answer[i] = max;
            }
        }
        
        
        return answer;
    }
}