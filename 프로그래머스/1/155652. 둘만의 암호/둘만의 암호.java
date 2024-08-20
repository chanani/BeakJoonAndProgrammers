class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        // 아스키 코드 a = 97, z = 122
        
        for(char x : s.toCharArray()){
            for(int i = 0 ; i < index; i++){
                x += 1;
                if(x > 'z'){
                    x -= 26;
                } 
                if(skip.contains(String.valueOf(x))){
                    i--;
                }
            }
            answer += x;
        }
        
        
        return answer;
    }
}