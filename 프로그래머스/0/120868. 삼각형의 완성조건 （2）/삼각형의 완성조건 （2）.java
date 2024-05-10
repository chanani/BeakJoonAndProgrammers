import java.util.*; 
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int min = sides[0];
        int max = sides[1];
        for(int i = max - min + 1; i <= max; i++){
            answer++;
        }
        
        for(int i = max + 1; i < max + min; i++){
            answer++;
        }
        return answer;
    }
}