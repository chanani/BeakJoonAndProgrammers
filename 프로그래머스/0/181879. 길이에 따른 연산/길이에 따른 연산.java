class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length > 10){
            for(int x : num_list) {
                answer += x;
            }
            answer -= 1;
        } else for(int x : num_list) answer *= x;
        return answer;
    }
}