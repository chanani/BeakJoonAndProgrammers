class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) return false;
        
        s = s.replaceAll("[0-9]", "");
        if(s.length() != 0) return false;
        
        return answer;
    }
}