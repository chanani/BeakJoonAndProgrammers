class Solution {
    public int[] solution(long n) {
        int l = String.valueOf(n).length();
        int[] answer = new int[l];
        
        int a = l - 1;
        for(String x : String.valueOf(n).split("")){
            answer[a] = Integer.parseInt(x);
            a--;
        }
        
        
        return answer;
    }
}