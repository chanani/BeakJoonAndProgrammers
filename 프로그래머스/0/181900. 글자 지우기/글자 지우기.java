class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        boolean[] bool = new boolean[str.length];
        for(int i = 0; i < indices.length; i++) bool[indices[i]] = true;
        for(int i = 0; i < bool.length; i++) {
            if(!bool[i]) answer += str[i];
        }
        
        return answer;
    }
}