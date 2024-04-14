class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[11];
      
        for(int i = 1; i < arr.length; i++){
            arr[i] = 1;
            for(int j = 1; j <= i; j++) arr[i] = arr[i] *= j;
        }
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > n) {
                break;
            }
            answer++;
        }
        return answer;
    }
}