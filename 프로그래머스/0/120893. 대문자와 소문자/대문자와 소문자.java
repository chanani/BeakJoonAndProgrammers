class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i = 0; i < my_string.length(); i++){
            char x = str[i].charAt(0);
            if(x >= 'a' && x <= 'z'){
                answer += str[i].toUpperCase();
            } else {
                answer += str[i].toLowerCase();
            }
        }
        return answer;
    }
}