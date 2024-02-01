class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        int nc = 0;
        while(true){
            n++;
            nc = Integer.bitCount(n);
            if(count == nc){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}