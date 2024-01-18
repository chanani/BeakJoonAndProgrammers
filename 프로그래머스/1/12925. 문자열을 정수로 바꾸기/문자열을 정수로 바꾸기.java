class Solution {
    public int solution(String s) {
        if(s.matches("[0-9]+")) return Integer.parseInt(s);
        else if (s.charAt(0) == '+') return Integer.parseInt(s.substring(1, s.length()));
        else if (s.charAt(0) == '-') return Integer.parseInt(s);
        return 0;
    }
}