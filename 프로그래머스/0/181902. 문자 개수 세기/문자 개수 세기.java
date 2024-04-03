class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char x : my_string.toCharArray()){
           if(x > 64 && x < 91) answer[x - 65]++;
            else if(x > 96 && x < 123) answer[x - 71]++;
        }
        
        return answer;
    }
}