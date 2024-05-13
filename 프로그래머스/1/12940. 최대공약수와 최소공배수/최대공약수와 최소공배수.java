
class Solution {
        
    public int[] solution(int n, int m) {
        int max = Math.max(n, m); // a
        int min = Math.min(n, m); // b

        while(min != 0) {  // c
            int r = max % min;  
            max = min;  
            min = r; 
        }

        int gcd = n * m / max;   // d

        int[] answer = {max, gcd};
        return answer;
    }
    
    
}