class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(Math.abs(n - answer) > Math.abs(n - array[i])) answer = array[i];
            else if (Math.abs(n - answer) == Math.abs(n - array[i])) {
                answer = Math.min(answer, array[i]);
            }
        }
        return answer;
    }
}