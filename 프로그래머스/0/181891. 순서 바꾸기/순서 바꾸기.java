class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i = n; i < num_list.length; i++){
            answer[j++] = num_list[i];
        }
        int x = num_list.length - n;
        for(int i = 0 ; i < n; i++){
            answer[x++] = num_list[i];
        }
        return answer;
    }
}