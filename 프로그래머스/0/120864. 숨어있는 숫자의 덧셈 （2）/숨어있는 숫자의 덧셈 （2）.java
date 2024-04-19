class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]+");
        for(String x : str) {
            if(!x.equals("")){
                answer += Integer.parseInt(x);
            }
        }
        return answer;
    }
}