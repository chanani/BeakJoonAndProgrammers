class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        for(int i = my_string.length() - 1; i >= 0; i--){
            String str = my_string.substring(i, my_string.length());
            if(str.equals(is_suffix)) return 1;
        }
        return answer;
    }
}