class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        while(true){
            boolean ch = true;
            for(int i = 0; i < arr.length; i++){
                if(answer % arr[i] != 0)  ch = false;
            }
        
            if(ch) break;
            answer++;
        }
        
        
        
        return answer;
    }
}