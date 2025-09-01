class Solution {
    public String solution(String myString) {
        String answer = "";
       char[] charArray = myString.toCharArray();
        for (char c : charArray) {
            if(c < 'l') answer += "l";
            else answer += c;
        }
        return answer;
    }
}