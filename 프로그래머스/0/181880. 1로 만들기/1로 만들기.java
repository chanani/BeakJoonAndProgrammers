class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            int x = num_list[i];
            while(x != 1){
                if(x % 2 == 0) {
                    x = x / 2;
                    answer++;
                } else {
                    x = (x - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}