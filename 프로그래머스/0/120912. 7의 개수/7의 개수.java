class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String[] str = String.valueOf(array[i]).split("");
            for(String x : str) {
                if(x.equals("7")) answer++;
            }
        }
        return answer;
    }
}