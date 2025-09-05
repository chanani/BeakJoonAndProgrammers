class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for (int i = 1; i <= my_string.length() / m; i++) {
            String sub = my_string.substring((i - 1) * m , i * m);
            answer += sub.substring(c - 1, c);
        }
        return answer;
    }
}