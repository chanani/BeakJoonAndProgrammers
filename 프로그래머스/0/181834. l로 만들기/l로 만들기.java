class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        for(int i = 0; i < myString.length(); i++){
            char x = str[i].charAt(0);
            if(x >= 'a' && x < 'l') answer += "l";
            else answer += str[i];
        }
        return answer;
    }
}